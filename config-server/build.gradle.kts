plugins {
    id("com.google.cloud.tools.jib")
}

jib {
    to {
        image = "config-server:0.0.1"
    }

    container {
        ports = listOf("8888")
    }
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

    implementation("org.springframework.cloud:spring-cloud-config-server")

    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
}