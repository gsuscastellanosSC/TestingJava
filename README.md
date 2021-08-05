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
## ✅Class#10⚡️
```Análisis de los tests y mejoras```
* Nuestros test siguen un mismo proceso:
    1. Se ```preparan los objetos``` que vamos a probar.
    2. ```Llamamos al método``` que estamos probando.
    3. ```Comprobamos``` los resultados.

Podemos reducir la cantidad de código moviendo las partes comunes de preparación a una función que se ejecute antes de cada prueba.
Con ```@Before``` le indicamos a JUnit la función que debe ejecutar antes de cada prueba.
## ✅Class#11⚡️
```Reto 1: crear la función isEmpty```
* En una aplicación que estamos construyendo, nos hemos dado cuenta de que comprobamos muchas veces si un string está vacío o no. Por ello, vamos a implementar una función que realice esta tarea.
* Crearemos una clase StringUtil y dentro pondremos la función isEmpty:
    public class StringUtil {
        public static boolean isEmpty(String str) {
           ...
        }
    }
* Implementa esta función, y crea una clase StringUtilTest añadiendo tests que prueben varios escenarios:
    * Probar que un string cualquiera no es vacío
    * Probar que “” es un string vacío
    * Probar que null también es un string vacío
    * Extra: un string con espacios " " también lo queremos considerar como vacío (pista: puedes usar la función trim)
* Comparte tu solución en el panel de discusiones.
## ✅Class#12⚡️
```TDD: Definición, Beneficios, Ciclos y Reglas```

El Test Driven Development (TDD) o desarrollo guiado por test, creado por Kent Beck, consiste en escribir primero los test antes que las clases permitiéndote ver si el diseño de una clase es la adecuada.
* El ciclo del TDD
    * Red: escribe un test que falle.
    * Green: escribe el código necesario para que pase el test.
    * Refactor: refactoriza el código para que pase el test.
* Reglas
    1. Sólo escribirás código de test hasta que falle.
    2. Sólo escribirás código de producción para pasar el test.
    3. No escribirás más código de producción del necesario.
* Puedes combinar las reglas del TDD con su ciclo tal como hizo el profesor:
    1. Red: Escribirás el mínimo de código test que falle.
    2. Green: Escribirás el mínimo de código de producción que pase el test.
    3. Refactor: sólo cuando los tests estén pasando.
## ✅Class#13⚡️
```Ejemplos de TDD: calcular el año bisiesto```

* Descripción:
    Los años bisiestos son años con 366 días en vez de 365 y suceden cada 4 años.
* Para determinar si un año es bisiesto o no, debemos seguir las siguientes reglas:
    * Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
    * Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
    * Todos los años divisibles por 4 son bisiestos (1996, 2004, 2012)
    * Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
* Algunas clases de pruebas terminan con la palabra Should en lugar de Test porque podemos entenderlas como frases cuando se leen en conjunto con los nombres de los métodos.
* Por ejemplo, la clase ```DateUtilLeapYearShould``` con su método ```return_true_when_year_is_divisible_by_400``` pueden leerse como ```“Date utils leap year should return true when year is divisible by 400”``` o ```“Los utils para calcular el año bisiesto deben devuelven true cuando el año es divisible por 400”```.
## ✅Class#14⚡️
```Ejemplos de TDD: cálculo de descuentos```
## ✅Class#15⚡️
```Reto 2: Práctica de TDD```
* Solve ```FizzBuzz```.
* Solve ```Numbers to Roman```.
## ✅Class#16⚡️
```Organización de una aplicación```
* Por lo general una aplicación se divide en:
    * Interfaz: Se encarga de la comunicación con el exterior o un usuario.
    * Negocio: Es la lógica de nuestra aplicación.
    * Datos: Se encarga de guardar los datos de nuestra aplicación.
    * Cada capa se puede comunicar con otra, pero no conoce los detalles de implementación.
## ✅Class#17⚡️
```App de Películas: Test de Negocio```
## Class#18⚡️
```App de Películas: test de búsqueda de películas por su duración```
## Class#19⚡️
```Creación de la base de datos y tests de integración con bases de datos```
## Class#20⚡️
```Test de integración con base de datos: guardar películas y búsqueda de películas individuales```

Por el momento, nuestras pruebas están cargando varias veces la información de la base de datos y vamos a solucionar este problema creando una función que borre la información. Para esto, debemos usar la instrucción ```@After``` para que JUnit ejecute la función cada vez que termina de hacer un test.
## 🚧Lecturas recomendadas🚨
* [Mockito framework site](https://site.mockito.org/)
* [The Central Repository Search Engine](https://search.maven.org/search?q=g:org.mockito%20AND%20a:mockito-core&amp;core=gav)
* [JUnit – About](https://junit.org/junit4/)
* [Download and Install · junit-team/junit4 Wiki · GitHub](https://github.com/junit-team/junit4/wiki/Download-and-Install)