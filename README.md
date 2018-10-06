# Clase
La unidad fundamental en los lenguajes de programación orientada a objetos (POO) es la **Clase**. Un programa puede estar formado por una o varias clases. Las clases son plantillas para crear objetos. Al menos una clase debe contener un método principal para poder ejecutar la aplicación. Los lenguajes de programación como Java o C++ incluyen la palabra reservada _class_ para definir una clase. 

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
   double kilometros;
   String color;
   
   void acelerar() {}
   void frenar() {}
}
```
En este caso, la clase **Coche** contiene cuatro variables (marca, modelo, kilometros y color) que serán los atributos de cada objeto creado (o instanciado), y dos métodos (acelerar y frenar) que serán las "acciones" que podrá realizar cada objeto instanciado de **Coche**.

Si imaginásemos las clases en el mundo real en el que vivimos, podríamos decir que la clase **Coche** es una plantilla  
sobre cómo debe ser un coche. Todos los coches son objetos de la clase **Coche**. La clase **Coche** contiene la definición  
específica de un determinado coche (marca, modelo, color, etc), mientras que cada coche (Seat Ibiza azul, Peugeot 206 gris, Renault Clio verde, etc) es una instancia u objeto de dicha clase.

Veamos un ejemplo gráfico:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/car-oop.png" width="350"/>
</p>

Por tanto, podemos concluir que cada cada coche, con sus característacas particulares, es un _objeto_ de la clase **Coche**, que sirve como una plantilla para crear esos objetos.



