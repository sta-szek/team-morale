buildscript {
    val SPRING_BOOT_VERSION = "1.5.2.RELEASE"
    val KOTLIN_VERSION = "1.1.1"
    extra["KOTLIN_VERSION"] = KOTLIN_VERSION

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$SPRING_BOOT_VERSION")
        classpath("org.jetbrains.kotlin:kotlin-noarg:$KOTLIN_VERSION")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$KOTLIN_VERSION")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION")
    }
}

apply {
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("kotlin-jpa")
    plugin("org.springframework.boot")
}

version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

val KOTLIN_VERSION = extra["KOTLIN_VERSION"]

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-data-jpa")
    compile("com.h2database:h2")
    compile("org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION")
    compile("org.jetbrains.kotlin:kotlin-reflect:$KOTLIN_VERSION")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.8.4")

    testCompile("org.springframework.boot:spring-boot-starter-test")
}
