#!/bin/sh

# ==========================================================
# Docker Network Configuration
# ==========================================================
NETWORK_NAME="containerizeddb_default"
NETWORK_SUBNET="172.30.0.0/24"
NETWORK_GATEWAY="172.30.0.1"     # The host gateway for containers

# Create network only if it does NOT already exist
if ! docker network inspect "${NETWORK_NAME}" >/dev/null 2>&1; then
  docker network create \
    --subnet "${NETWORK_SUBNET}" \
    --gateway "${NETWORK_GATEWAY}" \
    "${NETWORK_NAME}"
fi

# ==========================================================
# Registry & Database Image Configuration
# ==========================================================
export DC_REGISTRY_OIG="localhost"
export DC_REGISTRY_DB="localhost"
export DC_DB_VERSION="19.3.0.0-ee"

export no_proxy="localhost,127.0.0.1,.dev.local,/var/run/docker.sock"

# ==========================================================
# Export Docker Compose Environment Variables
# ==========================================================
exportComposeEnv() {

  # Host identity
  export DC_HOSTNAME="kiot.dev.local"
  export DC_HOST_GATEWAY="${NETWORK_GATEWAY}"

  # Oracle Database
  export DC_DB_IP="172.30.0.2"
  export DC_DB_HOST="oimdb.dev.local"
  export DC_DB_PORT=1521
  export DC_DB_OEM_PORT=5500
  export DC_DB_SID="oimdb"
  export DC_DB_PDB="oimpdb"
  export DC_DB_SYSPWD="Passw0rd123"
  export DC_DB_DBDATA="/u01/app/docker/OIG/dbdata"

  # Oracle Identity Governance / WebLogic
  export DC_WLS_ADMIN_PASSWORD="Passw0rd123"
  export OIG_IMAGE="localhost/oracle/oig:14.1.2.1.0"

  # RCU
  export DC_RCU_SCHPWD="Passw0rd123"
  export DC_RCU_OIMPFX="OIM03"

  # Domain Home
  export DC_DOMAIN_HOME="/u01/app/docker/OIG/domain"
}

# ==========================================================
# Directory Handling
# ==========================================================
ensure_dir() {
  if [ ! -d "$1" ]; then
    mkdir -p "$1"
    chmod 777 "$1"
  fi
}

createDirs() {
  ensure_dir "${DC_DOMAIN_HOME}"
  ensure_dir "${DC_DOMAIN_HOME}/domains"
  ensure_dir "${DC_DOMAIN_HOME}/domains/ConnectorDefaultDirectory"
  ensure_dir "${DC_DB_DBDATA}"
}

# ==========================================================
# Main
# ==========================================================
echo "INFO: Setting up OIG Docker Environment..."
exportComposeEnv
createDirs

echo "INFO: Environment variables:"
env | grep -e "^DC_" | sort
