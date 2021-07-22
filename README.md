# 🚨[Curso Básico de Testing en Java](https://platzi.com/clases/testing-java/)🚨
## ✅Class#1⚡️
```Bienvenida```
* Bienvenido al curso de Testing en Java impartido por Ferran Maylinch, profesor y desarrollador de software, en este curso aprenderás:
    * ¿Qué es un test?
    * ¿Para qué sirve?
    * Tipos de test
    * Partes de un test
    * TDD
* En el curso programaremos utilizando el editor IntelliJ IDEA, además, usaremos librerías como JUnit Mockito.
## ✅Class#2⚡️
```Tipos y beneficios de los tests```
* Beneficios
    * Comprobar los requerimientos de nuestra aplicación.
    * Documentación y ejemplos de nuestras clases.
    * Mediante Test Driven Development (TDD) nos puede ayudar en el diseño de clases.
    * Confianza al desarrollar.
    * Confianza para refactorizar nuestro código.
    * Es una habilidad que se solicita cada vez más en el mercado.
* Existen test automáticos y manuales, los automáticos van a requerir tiempo de desarrollo y algunas veces no serán tan viables, pero de ser posible siempre trata de hacer test automáticos ya que:
    * Son más rápidos.
    * Son más fiables.
    * Son incrementales.
* Tipos de test
    * Unitario: realizan pruebas a una función o clase muy concreta de nuestro proyecto.
    * Integración: prueban cómo se conectan diferentes componentes de nuestro proyecto.
    * Funcionales: prueban una funcionalidad de nuestro proyecto, pueden involucrarse varias clases.
    * Inicio a fin: prueba todo un proceso del proyecto.
    * Estrés: útil para probar si nuestra aplicación puede soportar grandes cantidades de procesos y peticiones a la vez.
## ✅Class#3⚡️
```Instalación de IntelliJ IDEA, creación del Proyecto con Maven y Tests Unitarios```
    
    Vamos a descargar el editor IntelliJ IDEA y crear un proyecto en Maven. Para indicarle a Maven que usaremos Java 8 debemos añadir las siguientes líneas de código:

    <properties>
        <maven.compiler.source>1.8maven.compiler.source>
        <maven.compiler.target>1.8maven.compiler.target>
    </properties>
## ✅Class#4⚡️
```Testing en Java con JUnit para Verificar Contraseñas```
* En esta clase el profesor Ferran Maylinch nos enseña cómo escribir y realizar pruebas con JUnit para comprobar la seguridad en contraseñas utilizando expresiones regulares.
* JUnit es un framework de código abierto diseñado para escribir y realizar pruebas de manera rápida y sencilla utilizando el lenguaje Java. Otras bibliotecas y frameworks similares son: TestNG, Robot Framework y JWalk.
## ✅Class#5⚡️
```Creación de test unitario: lanzar una excepción para alertar sobre un error```

Vamos a utilizar una excepción con la función ```throw new RuntimeException("Error")``` en lugar de la función ```System.out.println("Error")``` para identificar más fácil los errores. Ahora, los mensajes tendrán un color diferente y pueden mostrarnos un poco más de información sobre los errores: ubicación, el resultado esperado, mensajes personalizados, entre otros.
## ✅Class#6⚡️
```Test unitario con JUnit```
* Vamos a añadir Junit a nuestro proyecto copiando las siguientes líneas de código:
    ```
        <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        </dependencies>
    ```
* La función ```assertEquals``` de JUnit se encarga de comprobar que dos valores sean iguales, en este caso comprobar si nuestra función ```repeat``` retorna el valor esperado.
* Debemos indicarle a JUnit mediante ```@Test``` que función va a realizar una prueba.
## 🚧Lecturas recomendadas🚨
* [JUnit – About](https://junit.org/junit4/)
* [Download and Install · junit-team/junit4 Wiki · GitHub](https://github.com/junit-team/junit4/wiki/Download-and-Install)