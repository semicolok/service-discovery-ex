# Service Discovery Example  
Service Discovery Sample project.  
This project is sample project for "Service Discovery" with [spring cloud](https://spring.io/projects/spring-cloud) and [spring cloud netflix eureka](https://github.com/Netflix/eureka).  

## Prerequisites  
* JDK 11 or later  

## Modules  
- [discovery-service](discovery-service)  
- [config-server](config-server)  
- [api-gateway](api-gateway)  
- [account-service](account-service)  
- [setting-service](setting-service)  

## Support Spring Active Profiles  
"discovery-service" doesn't need profiles.  
- dev, local (Only for "api-gateway", "account-service" and "setting-service".)
- native ("config-server must run with this profile.)  

## Project execution sequence  
1. discovery-service  
   - "discovery-service" should run first. 
   When other projects boot up, they will try to register themselves via this discovery-server endpoint. 
   So, it has to be ready to get request from them.  
2. config-server  
   - "config-server" manages and provides configuration values for other services.  
   You can find them from this [directory](config-server/src/main/resources/config).
3. api-gateway, account-service and setting-service  

## How to run  
- discovery-service  
  ```shell script
  ./gradlew discovery-service:bootRun 
  ```  
- config-server  
  ```shell script
  ./gradlew config-server:bootRun --args='--spring.profiles.active=native'
  ```  
- api-gateway  
  ```shell script
  ./gradlew api-gateway:bootRun --args='--spring.profiles.active=local'
  ```  
- account-service  
  ```shell script
  ./gradlew account-service:bootRun --args='--spring.profiles.active=local'
  ```  
- setting-service  
  ```shell script
  ./gradlew setting-service:bootRun --args='--spring.profiles.active=local'
  ```  
## URL
- Eureka  
  ```shell script
  open http://localhost:8761/
  ```  
- config-server (ex: get "account-service" local configuration values)  
  ```shell script
  curl -u configUser:P@ssw0rd http://localhost:8888/account-service/local
  ```  
- account-service (request to "account-service" via "api-gateway")  
  ```shell script
  curl http://localhost:8080/accounts/hello
  ```  
- setting-service (request to "settings-service" via "api-gateway")  
  ```shell script
  curl http://localhost:8080/settings/hello
  ```  
