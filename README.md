# WebLogic
## CVE-2018-2628
Additional information about CVE-2018-2628 can be found on my GitBook, [here](https://0xpthree.gitbook.io/notes/exploits-pocs/oracle/weblogic-cve-2018-2628).
![cve-2018-2628](images/cve-2018-2628.png)


## CVE-2019-2725
Additional information about CVE-2019-2725 can be found on my GitBook, [here](https://0xpthree.gitbook.io/notes/exploits-pocs/oracle/weblogic-cve-2019-2729).

Deserialization through `wls-wsat.war` and `wls9_async_response.war`. 

Payload [`burp-req01.txt`](cve-2019-2725/burp-req01.txt) tested successfully against VulnHubs WebLogic [10.3.6.0-2017](https://hub.docker.com/layers/vulhub/weblogic/10.3.6.0-2017/images/sha256-275ec19477cfda389dc1c42158033e7e8c650dd4cba9f090ca0ba673902b73c9?context=explore) container.
![cve-2019-2725](images/cve-2019-2725.png)

## CVE-2023-21839
Additional information about CVE-2023-21839 can be found on my GitBook, [here](https://0xpthree.gitbook.io/notes/exploits-pocs/oracle/weblogic-cve-2023-21839).

### Golang, exploiting IIOP
![cve-2023-21839-01](https://0xpthree.gitbook.io/~gitbook/image?url=https%3A%2F%2F2314265932-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FLZ9hPT4FtAP57VrTApYv%252Fuploads%252F0kpRyqL2LuPKr8mtAWdO%252Fimage.png%3Falt%3Dmedia%26token%3D5cf35eae-47f5-4411-837b-476295fb0ea9&width=768&dpr=1&quality=100&sign=ea3f31b7&sv=1)
![cve-2023-21839-02](https://0xpthree.gitbook.io/~gitbook/image?url=https%3A%2F%2F2314265932-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FLZ9hPT4FtAP57VrTApYv%252Fuploads%252F8IiPiKI4M047VeFlMEtn%252Fimage.png%3Falt%3Dmedia%26token%3De80538ed-f792-45e3-a75e-0e34fab96d8b&width=768&dpr=1&quality=100&sign=6ff0a792&sv=1)

### Java, exploiting T3
![cve-2023-21839_java01](images/cve-2023-21839_java01.png)
![cve-2023-21839_java02](images/cve-2023-21839_java02.png)
