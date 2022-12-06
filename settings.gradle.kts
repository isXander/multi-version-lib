pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.fabricmc.net") { name = "FabricMC" }
    }
}

rootProject.name = "multi-version-lib"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs")
    }
}
include("api")
include("impl11802")
include("impl11902")
