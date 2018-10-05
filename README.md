# Clase
La unidad fundamental de programación en Java es la **clase**. Un programa Java está formado por una o varias clases.  
Las clases en Java son plantillas para crear objetos. Al menos una clase debe contener un método principal para poder ejecutar la aplicación.  

Estructura de una clase:

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
Si imaginásemos las clases en el mundo real en el que vivimos, podríamos decir que la clase **Coche** es una plantilla  
sobre cómo debe ser un coche. Todos los coches son objetos de la clase **Coche**. La clase **Coche** contiene la definición  
específica de un determinado coche (marca, modelo, color, etc), mientras que cada coche (Seat Ibiza azul, Peugeot 206 gris, Renault Clio verde, etc) es una instancia u objeto de dicha clase.

Veamos un ejemplo gráfico:

![alt text](https://github.com/sergiosabater/PSP/blob/master/car-oop.png "Descripción gráfica de una clase en programación.")




