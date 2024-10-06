# WebLogic
## CVE-2019-2725
More information [here](https://app.gitbook.com/o/i5zzcCcQScEjAbS1CNWw/s/LZ9hPT4FtAP57VrTApYv/~/changes/84/exploits-pocs/oracle/weblogic-cve-2019-2729).

Deserialization through `wls-wsat.war` and `wls9_async_response.war`. 

Payload [`burp-req.txt`](cve-2019-2725/burp-req.txt) tested successfully against VulnHubs WebLogic [10.3.6.0-2017](https://hub.docker.com/layers/vulhub/weblogic/10.3.6.0-2017/images/sha256-275ec19477cfda389dc1c42158033e7e8c650dd4cba9f090ca0ba673902b73c9?context=explore) and Oracles [weblogic:12.2.1.3](https://container-registry.oracle.com/ords/f?p=113:4:100763132084359:::4:P4_REPOSITORY,AI_REPOSITORY,AI_REPOSITORY_NAME,P4_REPOSITORY_NAME,P4_EULA_ID,P4_BUSINESS_AREA_ID:5,5,Oracle%20WebLogic%20Server,Oracle%20WebLogic%20Server,1,0&cs=3KTZ9kW4gHaVNXvYp_seg3AmnCL3G7pI4VfyLUNKH2oNI2LPL15b5PgGNbUGWjuU0cZz_Tul__-raSj8DmP2tQQ) containers.
![cve-2019-2725](cve-2019-2725/cve-2019-2725.png)
