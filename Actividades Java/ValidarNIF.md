# Actividad Java - _Validar NIF_
Implementa una clase Java que tenga un método estático “ValidarNIF” que reciba un string con un NIF y devuelva true o false si es válido o no en función de la letra.

Acceso a la página principal de [ejercicios](http://blog.elinsti.com/index.php/programacion-de-servicios-y-procesos/).


```java
import java.util.*;

public class ValidarNIF {

	public static void main(String[] args) { //Método main
		Scanner sc = new Scanner (System.in); //Instanciamos la clase Scanner para obtener los datos.
		boolean read = false; //Variable booleana que usamos para detener el bucle.
		
		while(!read) {
			System.out.println("Introduce tu NIF: "); //Pedimos los datos al usuario.
			String nif = sc.nextLine(); //Asignamos la entrada de texto a una variable de tipo String.
			
			if(nif.length()!=9) { //Control de errores. Verificamos que la longitud introducida sea la correcta.
				System.out.println("NIF incorrecto. Por favor, reviselo.");
			}else {
				read = true;
				if(ValidarNIF(nif)) { //Si el valor devuelto por el método es 'true' indicamos al usuario que es válido.
					System.out.println("El NIF "+nif+" es válido.");
				}else {
					System.out.println("El NIF "+nif+" no es válido."); //Si el valor devuelto es 'false' indicamos que no es válido.
				}
			}//fin if-else
		}
	}//fin del método main
	
	
	public static boolean ValidarNIF (String nif) { //Método estático para validar el NIF.
		
		//Variables utilizadas en el método
		
		int numeros = Integer.parseInt(nif.substring(0,8)); //Parseamos a entero la parte numérica del String
		char letra = Character.toUpperCase(nif.charAt(nif.length()-1)); //Asignamos la letra a una variable de tipo char y la convertimos a mayúsculas.
		char[] codLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; //Creamos un array de char. Cada posición del array representa el código de letra que utilizaremos para validarlo posteriormente.
		int numLetra = numeros%23;
		
		if(letra==codLetra[numLetra]) { //Comparamos ambos valores, la letra introducida en el NIF con el código de letra obtenido.
			return true; //Si coinciden devueltre 'true'
		}else {
			return false; //Si no, devuelve 'false'
		}//fin del if-else
	}//fin del método ValidarNIF

}//fin de la clase 

```
