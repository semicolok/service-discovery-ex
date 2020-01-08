# Service Discovery Example  
Service Discovery Sample project.  
This project is sample project for "Service Discovery" with [spring cloud](https://spring.io/projects/spring-cloud) and [spring cloud netflix eureka](https://github.com/Netflix/eureka).  

## Prerequisites  
* JDK 11  

## Modules
- discovery-service  
- config-server  
- api-gateway  
- account-service  
- setting-service  

## Project execution sequence  
1. discovery-service  
   - "discovery-service" should run first. 
   When other projects boot up, they will try to register themselves via this discovery-server endpoint. 
   So, it has to be ready to get request from them.  
2. config-server  
   - "config-server" manages and provides configuration values for other services.  
   You can find them from this [directory](config-server/src/main/resources/config).
3. api-gateway, account-service and setting-service  
