plugins {
    id("com.google.cloud.tools.jib")
}

jib {
    to {
        image = "discovery-service:0.0.1"
    }

    container {
        ports = listOf("8761")
    }
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
}