# WebLogic
## CVE-2019-2725
More information [here](https://app.gitbook.com/o/i5zzcCcQScEjAbS1CNWw/s/LZ9hPT4FtAP57VrTApYv/~/changes/84/exploits-pocs/oracle/weblogic-cve-2019-2729).

Deserialization through `wls-wsat.war` and `wls9_async_response.war`. 

Payload [`burp-req01.txt`](cve-2019-2725/burp-req01.txt) tested successfully against VulnHubs WebLogic [10.3.6.0-2017](https://hub.docker.com/layers/vulhub/weblogic/10.3.6.0-2017/images/sha256-275ec19477cfda389dc1c42158033e7e8c650dd4cba9f090ca0ba673902b73c9?context=explore) container.
![cve-2019-2725](cve-2019-2725/cve-2019-2725.png)
