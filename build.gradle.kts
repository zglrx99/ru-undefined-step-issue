plugins {
    java
}

group = "com.github.zglrx99"
version = "1.0-SNAPSHOT"

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.cucumber:cucumber-java:6.8.0")
}