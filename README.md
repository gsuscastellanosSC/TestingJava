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
## ✅Class#7⚡️
```Organización de tests con JUnit```
* La forma correcta de separar nuestras pruebas es realizar cada una en su propia función, además, el nombre de la función debe describir que estamos probando.
* Para indicarle a JUnit que esperamos una excepción lo debemos hacer de la siguiente forma:
    ```
    @Test(expected = IllegalArgumentException.class)
    ```
## ✅Class#8⚡️
```Test con Mockito para simular un dado```
* Mockito nos va a servir para simular clases mientras probamos, para añadirlo a nuestro proyecto debemos copiar las siguientes líneas de código:
    ```
    <dependency>
        <groupId>org.mockitogroupId>
        <artifactId>mockito-coreartifactId>
        <version>2.23.4version>
        <scope>testscope>
    <dependency>
    ```
* Para instanciar un mock debemos utilizar la función ```Mockito.mock()``` e indicarle como parámetro la clase que va a simular.
* Las funciones ```assertFalse``` y ```assertTrue``` tal como su nombre lo indican, sirven para comprobar si un valor es igual a ```false``` o ```true``` respectivamente.
## ✅Class#9⚡️
```Test con Mockito: simular el uso de una pasarela de pago```
## 🚧Lecturas recomendadas🚨
* [Mockito framework site](https://site.mockito.org/)
* [The Central Repository Search Engine](https://search.maven.org/search?q=g:org.mockito%20AND%20a:mockito-core&amp;core=gav)
* [JUnit – About](https://junit.org/junit4/)
* [Download and Install · junit-team/junit4 Wiki · GitHub](https://github.com/junit-team/junit4/wiki/Download-and-Install)