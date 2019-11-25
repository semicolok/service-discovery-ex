pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
}

rootProject.name = "discover-ex"
include("discovery-service", "config-server", "api-gateway", "setting-service", "account-service")
