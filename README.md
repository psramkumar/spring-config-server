# Config server for externalizing the property files!!

## development:
* port: 8888
* URL: http://localhost:8888/config/

Each client can have separate folder under the git repo :- https://github.com/psramkumar/spring-config.git

#### Example:
    microservice1 is a folder which holds all the configuration required for microservice1. 
    
Client needs to supply {application} in order to access the files. 
please note that {profile} is not taken into account as it will have separate property files per environment.

Here is a sample client application yml file:

```
spring:
  application:
    name: microservice1
  profiles: development
  cloud:
    config:
      uri: http://localhost:8888/config
      label: development
    
```
