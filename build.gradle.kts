plugins {
    `api-module` apply false
}

allprojects {
    group = "dev.isxander"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "api-module")
}

