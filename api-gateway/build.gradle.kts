plugins {
    id("com.google.cloud.tools.jib")
}

jib {
    to {
        image = "api-gateway:0.0.1"
    }

    container {
        ports = listOf("8080")
    }
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
}