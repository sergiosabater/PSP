```java
public class ActividadValidarDNI {
	
	public static void main(String[] args) { //Método main
		
		String dni = "03496594L"; //String con el valor de DNI
		
		if(dni.length()!=9) { //Control de errores. Verificamos que la longitud introducida sea la correcta.
			System.out.println("DNI incorrecto. Por favor, revise su dni");
		}else {
			System.out.println(ValidarNIF(dni)); //Invocamos el método creado e imprimimos el resultado por pantalla.
		}//fin if-else
	}//fin del método main
	
	public static boolean ValidarNIF (String dni) { //Método estático para validar el DNI.
		
		//Variables utilizadas en el método
		
		int numeros = Integer.parseInt(dni.substring(0,8)); //Parseamos a entero la parte numérica del String
		char letra = Character.toUpperCase(dni.charAt(dni.length()-1)); //Asignamos la letra a una variable de tipo char y la convertimos a mayúsculas.
		char[] codLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; //Creamos un array de char. Cada posición del array representa el código de letra que utilizaremos para validarlo posteriormente.
		int numLetra = numeros%23;
		
		if(letra==codLetra[numLetra]) { //Comparamos ambos valores, la letra introducida en el DNI con el código de letra obtenido.
			return true; //Si coinciden devueltre 'true'
		}else {
			return false; //Si no, devuelve 'false'
		}//fin del if-else
	}//fin del método ValidarNIF

}//fin de la clase 
```
