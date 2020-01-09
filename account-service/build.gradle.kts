plugins {
    id("net.ltgt.apt") version "0.21"
    id("io.freefair.lombok") version "4.1.6"
}

dependencies {
    annotationProcessor("org.mapstruct:mapstruct-processor:1.3.1.Final")
    implementation("org.mapstruct:mapstruct:1.3.1.Final")

    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("org.springframework.cloud:spring-cloud-starter-config")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("com.google.guava:guava:28.1-jre")
}