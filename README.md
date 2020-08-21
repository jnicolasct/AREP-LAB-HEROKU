# AREP-LAB-HEROKU

### Este programa calcula la media y desviacion estandar de los numeros que se ingresan mediante una pagina web.

[![CircleCI](https://circleci.com/gh/jnicolasct/AREP-LAB-HEROKU.svg?style=svg)](https://circleci.com/gh/jnicolasct/AREP-LAB-HEROKU)

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://areplabheroku.herokuapp.com/)


## Insatalacion y compilacion

Para instalar el programa se debe clonar el proyecto con el comando git clone URL del proyecto o descargar el zip de este y extraer los archivos en su computador y finalamente abrirlo desde cualquier IDE

Para la compilacion, dentro del directorio del proyecto desde la cmd ejecutar el comando mvn package.

### Requisitos

  - JDK instalado
  - maven instalado
  

## Uso

Para usar el programa se debe ingresar al link de heroku he ingresar los datos, separados por coma y dar click en el boton submit:

![image](https://user-images.githubusercontent.com/47215172/90847343-e4370300-e32f-11ea-8bd9-289e4147b35d.png)

esto lo redirije a una pagina donde muestra la media y la desviacion estandar de los datos ingresados. 

![image](https://user-images.githubusercontent.com/47215172/90847385-fd3fb400-e32f-11ea-8e8f-ced2ca841e60.png)

si se quiere volver a ingresar diferente datos, se debe dar click en el boton volver.



## Contexto

  - Media: es el promedio de un conjunto de datos, acontinuacion la fromula.
  
    ![image](https://user-images.githubusercontent.com/47215172/90081834-0d261b00-dcd4-11ea-8339-5247e1f6bd4f.png)
  
  - Desviacion estandar: es una medida de la extensión o dispersión de un conjunto de datos, acontinuacion la formula.
  
    ![image](https://user-images.githubusercontent.com/47215172/90081942-3181f780-dcd4-11ea-86d8-b36b580ac64e.png)
    
  - Spark: es un simple y expresivo marco web de Java/Kotlin DSL construido para un desarrollo rápido. La intención de Sparks es proporcionar una alternativa para los desarrolladores de Java/Kotlin que quieran desarrollar sus aplicaciones web de la forma más expresiva posible y con un mínimo de complejidad. 
    
    
## Pruebas

  Los datos que se tomaron para la realizacion de las pruebas fueron:
  
  ![image](https://user-images.githubusercontent.com/47215172/90082094-8de51700-dcd4-11ea-92af-424daf14fb40.png)
  
  Los resultados obtenidos de esta despues del ejecutar el comando mvn package fue:

  ![image](https://user-images.githubusercontent.com/47215172/90082014-570f0100-dcd4-11ea-8934-9e5f87b6b52c.png)
  
  
## Reporte

El reporte fue generado mediante latex, su nombre es Media y Desviacion estadar. Se encuentra en la raiz del proyecto

## Autor
  Johan Nicolas Cortes Torres
