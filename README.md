# Selenium Java Automation - Proyecto Demo

## Descripción
Este es un proyecto de automatización de pruebas utilizando **Selenium**, **Cucumber** y **JUnit** en **Java**. Se centra en pruebas automatizadas de diferentes páginas web como Amazon.

## Tecnologías Utilizadas
- **Java** (versión 13)
- **Selenium WebDriver**
- **Cucumber**
- **JUnit**
- **Gradle**
- **ExtentReports** (para reportes de ejecución)

## Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de tener instalado:
- **Java 13 o superior**
- **Gradle**
- **Un navegador compatible** (Chrome, Firefox, etc.)
- **WebDriver correspondiente** al navegador (ChromeDriver, GeckoDriver, etc.)

## Instalación
1. Verifica que tienes Gradle instalado ejecutando:
   ```sh
   gradle -v
   ```
3. Si no tienes Gradle instalado, usa el wrapper incluido:
   ```sh
   ./gradlew --version (Linux/Mac)
   gradlew.bat --version (Windows)
   ```

## Estructura del Proyecto
```
selenium-java-demo/
|-- src/
|   |-- main/
|   |   |-- java/
|   |       |-- pages/  # Clases base para páginas
|   |-- test/
|       |-- java/
|       |   |-- runner/  # Runner para Cucumber
|       |   |-- steps/   # Definición de pasos
|       |-- resources/
|           |-- features/  # Archivos .feature de Cucumber
|-- build.gradle
|-- README.md
```

## Ejecución de Pruebas
### Ejecutar todas las pruebas
```sh
./gradlew test
```
### Ejecutar pruebas con una etiqueta específica
```sh
./gradlew test -Dcucumber.options="--tags @Imagen"
```
### Generar Reportes con ExtentReports
Despues de la ejecución, los reportes se generan en:
```
target/cucumber-html-report/index.html
```

## Configuración de Dependencias (build.gradle)
```gradle
plugins {
    id 'java'
}

group 'CursoUdemy'
version '1.0'
sourceCompatibility = 13

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.seleniumhq.selenium:selenium-java:3.141.59'
    implementation 'io.cucumber:cucumber-java:7.2.3'
    testImplementation 'io.cucumber:cucumber-junit:7.2.3'
    testImplementation 'org.slf4j:slf4j-simple:1.7.30'
    implementation 'io.cucumber:cucumber-core:7.2.3'
    implementation 'com.aventstack:extentreports-cucumber4-adapter:1.0.7'
}
```
