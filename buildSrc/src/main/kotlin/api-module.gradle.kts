plugins {
    java
    id("fabric-loom")
}

loom {
    runs {
        getByName("client") { ideConfigGenerated(false) }
        getByName("server") { ideConfigGenerated(false) }
    }
}

repositories {
    maven("https://maven.terraformersmc.com")
}

dependencies {
    modImplementation("net.fabricmc:fabric-loader:0.14.11")
}

if (project.path != ":api") {
    val testmod by sourceSets.registering {
        compileClasspath += sourceSets["main"].compileClasspath
        runtimeClasspath += sourceSets["main"].runtimeClasspath
    }

    loom {
        runs {
            register("testmod") {
                name("Test Mod")
                client()
                ideConfigGenerated(true)
                source(testmod.get())
            }
        }

        createRemapConfigurations(testmod.get())
    }

    dependencies {
        implementation(project(path = ":api", configuration = "namedElements"))

        "testmodImplementation"(sourceSets["main"].output)
    }
}

tasks.processResources {
    inputs.property("version", project.version)

    filesMatching("fabric.mod.json") {
        expand(
            "version" to project.version
        )
    }
}