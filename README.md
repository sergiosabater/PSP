# Conceptos básicos de Programación Orientada a Objetos - Java

## Clase
La unidad fundamental en los lenguajes de programación orientada a objetos (POO) es la **Clase**. Un programa ha de estar compuesto por al menos una clase. Y al menos una clase debe contener un método principal para poder ejecutar el programa. Las clases son en esencia "plantillas" para crear objetos. Los lenguajes de programación como Java o C++ incluyen la palabra reservada _class_ para definir una clase. 

Estructura general de una clase:

    • Cabecera
    
    • Campos o atributos
        • Variables
        • Constantes
        
    • Métodos
        • Funciones
        • Constructores
        • Bloques de inicialización static
        • Finalizador
        
Ejemplo en código Java:
        
```java
public class Coche { 

   String marca;
   String modelo;
   String color;
   
   void acelerar() {}
   void frenar() {}
}
```
En este caso, la clase **Coche** contiene tres variables (marca, modelo y color) que serán los atributos de cada objeto creado (o instanciado), y dos métodos (acelerar y frenar) que serán las "acciones" que podrá realizar dicho objeto instanciado de **Coche**.

Si imaginásemos las clases en el mundo real en el que vivimos, podríamos decir que la clase **Coche** es una plantilla  
sobre cómo debe ser un coche. Todos los diferentes coches existentes son objetos de la clase **Coche**. La clase **Coche** contiene la definición los atributos que puede tener un determinado coche (marca, modelo, color, etc), mientras que cada coche (Seat Ibiza azul, Peugeot 206 gris, Renault Clio verde, etc) posee unos atributos determinados y es una instancia de dicha clase.

Veamos un ejemplo gráfico:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/car-oop.png" width="350"/>
</p>

Por tanto, podemos concluir que cada cada coche, con sus características particulares (color, marca, modelo), es un _objeto_ de la clase **Coche**, que sirve como una plantilla general para crear cada uno de esos objetos.
  
  
  
  
- - -  
  
  
## Objeto

Un **Objeto** o instancia de una **Clase** puede definirse como una _entidad concreta_ de una **Clase**. Cada **Objeto**, como todas las variables en Java, ha de ser declarado antes de ser utilizado.

Siguiendo el ejemplo anterior en la definición de una **Clase**, podemos declarar un objeto de la siguiente manera:

```java
Coche coche1 = new Coche();
```
Con esta instrucción declaramos una variable llamada **coche1** de la clase **Coche**. El objeto concreto, **coche1**, contendrá una referencia a ese objeto. Es decir, almacenará la dirección de memoria en la que realmente se halla el objeto propiamente dicho. La palabra reservada _`new`_ se utiliza para crear nuevos objetos, instancias de una determinada clase que indicamos a continuación seguida de un par de paréntesis. De esta forma se está invocando a un método especial que tienen todas las clases que sirve para construir el objeto en cuestión con sus valores iniciales. A este método se le conoce como _constructor de la clase_.

Una vez definida una **Clase** podemos crear todos los **Objetos** que necesitemos de ella. Veamos un ejemplo:

```java
Coche coche2 = new Coche();
Coche coche3 = new Coche();
Coche coche4 = new Coche();
```
Podemos concluir que un **Objeto** es el resultado de la instanciación de una **Clase**. Una **Clase** es el anteproyecto que ofrece la funcionalidad en ella definida, pero ésta queda implementada solo al crear el **Objeto**. Siguiendo con el ejemplo, tenemos un esquema para construir coches (la clase **Coche**), y un coche concreto (p.ej. **coche1**) es un objeto construido a partir de ese esquema.
  
  
  
  
- - -  
  
  
## Herencia

La **Herencia** es un mecanismo que permite la definición de una **Clase** a partir de otra ya existente. La herencia permite compartir métodos y datos entre **Clases**, **Subclases** y **Objetos**. La herencia es utilizada por las ventajas que ofrece en la reutilización de código en la POO (Programación Orientada a Objetos). Esto significa de que cualquier **Clase** puede derivar otra que usará los datos y métodos de la clase padre, o bien redefinirlos. Además también puede incorporar otros datos o métodos propios.

Existen dos tipos de herencia: **Herencia Simple** y **Herencia Múltiple**. En la Herencia Simple se pueden definir nuevas clases solamente a partir de una clase inicial, mientras que en la Herencia Múltiple se pueden definir nuevas clases a partir de dos o más clases iniciales. En Java de momento solo se permite la **`Herencia Simple`**.

El concepto de herencia conduce a una estructura jerárquica de clases o estructura de árbol. En la POO todas las relaciones entre clases deben ajustarse a dicha estructura. En esta estructura jerárquica, cada clase tiene solo una clase padre. La clase padre de cualquier clase es conocida como _`superclase`_. La clase hija de una superclase es llamada _`subclase`_.

Veamos un ejemplo gráfico de dicha estructura:




