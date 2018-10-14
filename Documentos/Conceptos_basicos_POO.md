# Conceptos básicos de Programación Orientada a Objetos - Java

## Contenidos

- [Clase](https://github.com/sergiosabater/PSP/blob/master/Documentos/Conceptos_basicos_POO.md#clase)
- [Objeto](https://github.com/sergiosabater/PSP/blob/master/Documentos/Conceptos_basicos_POO.md#objeto)
- [Sobrecarga de métodos](sergiosabater/PSP/blob/master/Documentos/Conceptos_basicos_POO.md#sobrecarga-de-m%C3%A9todos)
- [Herencia](https://github.com/sergiosabater/PSP/blob/master/Documentos/Conceptos_basicos_POO.md#herencia)
- [Polimorfismo](https://github.com/sergiosabater/PSP/blob/master/Documentos/Conceptos_basicos_POO.md#polimorfismo)
- [Interface](https://github.com/sergiosabater/PSP/blob/master/Documentos/Conceptos_basicos_POO.md#interface)

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
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/car-oop.png" width="350"/>
</p>

Por tanto, podemos concluir que cada cada coche, con sus características particulares (color, marca, modelo), es un _objeto_ de la clase **Coche**, que sirve como una plantilla general para crear cada uno de esos objetos.  

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/README.md#conceptos-b%C3%A1sicos-de-programaci%C3%B3n-orientada-a-objetos---java)  
  
  
  
  
- - -  
  
  
## Objeto

Un **Objeto** o instancia de una **Clase** puede definirse como una _entidad concreta_ de una **Clase**. Cada **Objeto**, como todas las variables en Java, ha de ser declarado antes de ser utilizado.

Siguiendo el ejemplo anterior en la definición de una **Clase**, podemos declarar un objeto de la siguiente manera:

```java
Coche coche1 = new Coche();
```
Con esta instrucción declaramos una variable llamada **coche1** de la clase **Coche**. El objeto concreto, **coche1**, contendrá una referencia a ese objeto. Es decir, almacenará la dirección de memoria en la que realmente se halla el objeto propiamente dicho. La palabra reservada _`new`_ se utiliza para crear nuevos objetos, instancias de una determinada clase que indicamos a continuación seguida de un par de paréntesis. De esta forma, con _`Coche()`_ se está invocando a un método especial que tienen todas las clases que sirve para construir el objeto en cuestión con sus valores iniciales. A este método se le conoce como _constructor de la clase_.

Una vez definida una **Clase** podemos crear todos los **Objetos** que necesitemos de ella. Veamos un ejemplo:

```java
Coche coche2 = new Coche();
Coche coche3 = new Coche();
Coche coche4 = new Coche();
```
Podemos concluir que un **Objeto** es el resultado de instanciar una **Clase**. Una **Clase** es el anteproyecto que ofrece la funcionalidad en ella definida, pero ésta queda implementada solo al crear el **Objeto**. Siguiendo con el ejemplo, tenemos un esquema para construir coches (la clase **Coche**), y un coche concreto (p.ej. **coche1**) es un objeto construido a partir de ese esquema.  

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/README.md#conceptos-b%C3%A1sicos-de-programaci%C3%B3n-orientada-a-objetos---java)  
  
  
  
  
- - -  
  
  
## Sobrecarga de métodos

La **Sobrecarga de métodos** (_Overloading_) se utiliza para reutilizar el nombre de un método para usarlo con diferentes argumentos y, opcionalmente, con un tipo diferente de retorno.

Veamos un método cualquiera, por ejemplo:

```java
public void modificarObjeto (int tamano, String nombre) {}
```
Los siguientes métodos son sobrecargas del método modificarObjeto():

```java
public int modificarObjeto (int tamano){}
public double modificarObjeto (double tamano){}
public void modificarObjeto (String nombre){}
```
Lo que define qué método se va a llamar son los argumentos que se envían durante la llamada. Si se invoca un método con un String como argumento, se ejecutará el método que tome un String como argumento. Si se llama un método que tenga un int como argumento, se ejecutará el método que tome el int como argumento, y así sucesivamente. Si se invoca a un método con un argumento que no es definido en ninguna de las versiones sobrecargadas el compilador lanzará un mensaje de error.

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/README.md#conceptos-b%C3%A1sicos-de-programaci%C3%B3n-orientada-a-objetos---java)  
  
  
  
  
- - -  
  
  
## Herencia

La **Herencia** es un mecanismo que permite la definición de una **Clase** a partir de otra ya existente. La herencia permite compartir métodos y datos entre **Clases**, **Subclases** y **Objetos**. La herencia es utilizada por las ventajas que ofrece en la reutilización de código en la POO (Programación Orientada a Objetos). Esto significa de que cualquier **Clase** puede derivar otra que usará los datos y métodos de la clase padre, o bien redefinirlos. Además también puede incorporar otros datos o métodos propios.

Existen dos tipos de herencia: **Herencia Simple** y **Herencia Múltiple**. En la Herencia Simple se pueden definir nuevas clases solamente a partir de una clase inicial, mientras que en la Herencia Múltiple se pueden definir nuevas clases a partir de dos o más clases iniciales. `En Java solo se permite la`**`Herencia Simple`**.

El concepto de herencia conduce a una estructura jerárquica de clases o estructura de árbol. En la POO todas las relaciones entre clases deben ajustarse a dicha estructura. En esta estructura jerárquica, cada clase tiene solo una clase padre. La clase padre de cualquier clase es conocida como _`superclase`_. La clase hija de una superclase es llamada _`subclase`_.

Veamos un ejemplo gráfico de dicha estructura:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/herencia.png" width="650"/>
</p>

Como podemos observar en la imagen, la **superclase** en este caso es _Animal_. De ella descienden tres **subclases**, que son _Carnívoro_, _Herbívoro_ y _Omnívoro_. Estas tres subclases o clases hijas son a su vez son clases padre de sus respectivas clases hijas (_Felino_ y _Cánido_ para Carnívoro, _Rumiante_ e _Insecto_ para Herbívoro, etc). Y cada una de esas clases hijas es a la vez clase padre de otras.
Podemos concluir que la superclase es aquella clase de la cual descienden todas las demás. Una superclase puede tener cualquier número de subclases, pero una subclase solo puede tener una superclase.

Ahora observemos el ejemplo en código Java. Tenemos la siguiente **superclase** _Animal_:

```java
public abstract class Animal //palabra reservada abstract para referirnos a la superclase
{

// atributos

	protected String lugarNacimiento;

// constructores
    
	public Animal() {

	}
		...
	
// métodos

	public void crecer() {
		...	
	}

	public void comer() {
		...
	}
	
// getters y setters
	
	public String getLugarNacimiento()
        {
                return lugarNacimiento;
        }
		...
}

```

Y a continuación la **subclase** _Carnívoro_ que hereda de _Animal_:

```java
public class Carnivoro extends Animal //Subclase de Animal
{

// atributos

	private int numeroDientes;

// constructores
    
	public Carnivoro() {
		super(); //invoca al constructor de la clase superior para compartir el mismo tipo de parametrización.
	}
	
	public Carnivoro(String lugarNacimiento, int numeroDientes) {
		super(); //invoca al constructor de la clase superior para compartir el mismo tipo de parametrización.
		this.numeroDientes = numeroDientes;
	}
		
	
// métodos

	public void morder() {
		...	
	}


// getters y setters
	
	public String getNumeroDientes()
        {
                return numeroDientes;
        }
		...
}

```
En este caso la **subclase** _Carnivoro_ hereda todos los atributos y métodos de su **clase padre** _Animal_, teniendo a parte los suyos propios. Y lo mismo ocurrirá con las subclases de _Carnivoro_. De esta forma es posible ahorrar código evitando reescribirlo cada vez que creamos una subclase que implemente los mismos métodos y posea los mismos atributos que la clase padre. Además cada una de estas subclases también puede redefinir métodos de su clase padre para realizar funciones específicas.  

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/README.md#conceptos-b%C3%A1sicos-de-programaci%C3%B3n-orientada-a-objetos---java)
  
  
  
  
- - -  
  
  
## Polimorfismo

**Polimorfismo** es una palabra de origen griego que significa _"muchas formas"_. En la POO este término se utiliza para referirse a la propiedad por la que es posible `enviar mensajes sintácticamente iguales a objetos de tipos diferentes`.

Por ejemplo, la **clase padre** tiene atributos y métodos comunes a todas las **clases hijas** o subclases. En la clase padre se implementan métodos que pueden tener todas sus clases hijas. La **superclase** es una _clase abstracta_ y las clases abstractas no se pueden instanciar, es decir, no podemos crear objetos de las clases abstractas. Siguiendo con el ejemplo anterior, nunca podríamos hacer un "new Animal()". También podemos usar la palabra reservada _abstract_ en un método de la clase padre. Esto significaría que todas las clases hijas tienen que implementar `obligatoriamente` ese método.

Aplicando el concepto de **polimorfismo** al ejemplo anterior podemos decir que la clase _Animal_ puede tener varias formas: _Carnívoro_, _Herbívoro_ y _Omnívoro_. Una de las ventajas de la herencia y el polimorfismo es que las clases hijas no solo heredan los métodos de la clase padre, sino que los pueden "redefinir" o sobreescribir.

Veamos ejemplos en código:

Clase padre (superclase) _Animal_ (fragmento de código):

```java
public abstract class Animal
{

	protected String lugarNacimiento;

	public Animal() {

	}
		...
		
// métodos

	// METODO ABSTRACTO -> no se implementa en la clase abstracta pero si en la clases hijas
	public abstract void crecer() {}

	public void comer() {
		System.out.println("Comiendo");
	}

		...
}

```

Clase hija _Carnivoro_ (fragmento de código):

```java
public class Carnivoro extends Animal
{

		...	

// métodos
	
	// Método obligatorio implementado en la clase hija.
	@Override
	public void crecer() {
		System.out.println("Soy carnívoro y crezco rápido"); 	
	}
	
	// Método redefinido en la clase hija.
	@Override
	public void comer() {
		System.out.println("Comiendo carne"); 	
	}
	
	// Método propio de la clase hija
	public void morder() {
		...	
	}
		...
}

```

Clase hija _Herbívoro_ (fragmento de código):

```java
public class Herbivoro extends Animal
{
		...	

// métodos
	
	// Método obligatorio implementado en la clase hija.
	@Override
	public void crecer() {
		System.out.println("Soy herbivoro y crezco lento"); 	
	}
	
	// Método propio de la clase hija
	public void rumiar() {
		...	
	}
		...
}

```


En el código podemos observar que todas las clases hijas tienen implementado el método "crecer()" porque si la clase padre lo tiene como método abstracto es obligatorio que todas las clases hijas tengan este método. Por encima de los métodos "crecer()" y "comer()" tenemos la etiqueta **@Override**. Esta etiqueta sirve para indicar que en el código estamos re-escribiendo o "especializando" un método que se encuentra en la clase padre y que queremos redefinir en la clase hija. Por tanto, cuando llamemos al método de una clase hija y éste haya sido redefinido en ella, se ejecutará dicho método redefinido. De lo contrario, si la clase hija no lo ha redefinido, se ejecutará el método de la clase padre.

Por último veamos cómo quedaría la ejecución del código:

1. Escribimos el código:

```java
Animal tigre = new Carnivoro();
Animal jirafa = new Herbivoro();

System.out.println("Objeto Carnivoro: "+tigre.crecer());
tigre.comer();
System.out.println("Objeto Herbivoro: "+jirafa.crecer());
jirafa.comer();

```

2. Ejecutamos el código. Este sería el resultado:

```
Objeto Carnivoro: Soy carnívoro y crezco rápido
Comiendo carne
Objeto Herbivoro: Soy herbívoro y crezco lento
Comiendo
```

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/README.md#conceptos-b%C3%A1sicos-de-programaci%C3%B3n-orientada-a-objetos---java)
  
  
  
  
- - -  
  
  
## Interface

Un **Interface** (o Interfaz) es una colección de métodos abstractos y propiedades constantes. En las interfaces se especifican los métodos pero no su comportamiento. Serán las clases que implementen estas interfaces las que describan el comportamiento de los métodos.

Las ventajas que proporciona el uso de las interfaces en Java son:

- Organización
- Permiten declarar constantes que estarán disponibles para todas las clases que implementen dicha interfaz.
- Obligar a que ciertas clases utilicen los mismos métodos (nombres y parámetros).
- Establecer relaciones entre clases que no estén relacionadas.

Para trabajar con interfaces, Java proporciona dos palabras reservadas: `interface` e `implements`.

Ejemplo en código:

Declarar una interfaz:

```java
public interface Interfaz {
	public int sumar(int num1, int num2){}
	
	public void saludar(){}
	.....
```

Implementar una interfaz en una clase:

```java
public class Clase implements Interfaz {
	public sumar(int num1, int num2){
		//Implementación del método
		int result = num1 + num2;
		return result;
	}
	
	public saludar(){
		//Implementación del método
		System.out.println("Hola");
	}
	.....
```
[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/README.md#conceptos-b%C3%A1sicos-de-programaci%C3%B3n-orientada-a-objetos---java)
  
  
  
  
- - -  
  
  
