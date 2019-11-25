import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    id("org.springframework.boot") version "2.1.9.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.8.RELEASE" apply false
    id("com.google.cloud.tools.jib") version "1.8.0" apply false
}

allprojects {
    apply {
        plugin("java")
        plugin("idea")
    }

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    tasks.withType<Test> {
        systemProperty("file.encoding", "UTF-8")
    }

    val nexusUrl: String by project

    repositories {
        jcenter()
    }
}

subprojects {
    apply {
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    configure<DependencyManagementExtension> {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:Greenwich.SR4")
        }
    }

    val compile by configurations
    val runtime by configurations

    dependencies {
        compile("javax.xml.bind:jaxb-api:2.3.1")
        runtime("org.glassfish.jaxb:jaxb-runtime:2.3.1")
        compile("org.javassist:javassist:3.24.1-GA")
        compile("javax.activation:javax.activation-api:1.2.0")
    }
}