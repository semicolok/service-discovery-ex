plugins {
    id("com.google.cloud.tools.jib")
    id("io.freefair.lombok") version "4.1.6"
}

jib {
    to {
        image = "setting-service:0.0.1"
    }

    container {
        ports = listOf("8082")
    }
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("org.springframework.cloud:spring-cloud-starter-config")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("com.google.guava:guava:28.1-jre")

    implementation("org.springdoc:springdoc-openapi-ui:1.2.25")
}