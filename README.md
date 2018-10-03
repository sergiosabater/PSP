# Clase
La unidad fundamental de programación en Java es la **clase**. Un programa Java está formado por una o varias clases.  
Las clases en Java son plantillas para crear objetos. Al menos una clase debe contener un método principal para poder ejecutar la aplicación.  
Si imaginásemos las clases en el mundo real en el que vivimos, podríamos decir que la clase **“coche”** es una plantilla  
sobre cómo debe ser un coche. Todos los coches son objetos de la clase **“coche”**. La clase **“coche”** contiene la definición  
específica de un determinado coche (color, marca, modelo, etc), mientras que cada coche es una instancia u objeto de dicha clase.

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
        
```
public class Dog {
   String breed;
   int age;
   String color;

   void barking() {
   }

   void hungry() {
   }

   void sleeping() {
   }
}
```
