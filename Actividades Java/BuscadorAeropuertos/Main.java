import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;


public class Main {
	
	public static ArrayList<Aeropuerto> listaAeropuertos = new ArrayList<Aeropuerto>();
	
	//Método para cargar y guardar el fichero de datos
	public static void cargarFicheroDatos() {
		try {
			
			//Indicamos la dirección web del fichero y establecemos la conexión
			URL url = new URL("https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat");
			URLConnection urlCon = url.openConnection();
			
			//Acceso al contenido del fichero
			InputStream is = urlCon.getInputStream();
			
			//Fichero en el que queremos guardar el contenido
			FileOutputStream fos = new FileOutputStream("dataAirport.dat");
			
			//Buffer de lectura
			byte[] array = new byte[1000];
			
			//Lectura
			int leido = is.read(array);
			while (leido > 0) {
			   fos.write(array,0,leido);
			   leido=is.read(array);
			}
			
			// Cierre de conexion y fichero.
			is.close();
			fos.close();
			
		} catch (Exception e) {}
		
	}
	
	
	//Método para leer el archivo descargado
	public static void leerArchivo() {
		String fichero = "dataAirport.dat";
		BufferedReader br = null;
		String linea ="";
		String ficheroSplit =",";
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			while((linea = br.readLine())!=null) {
				
				//Eliminamos las comillas
				linea = linea.replace("\"", "").toUpperCase();
				
				//Usamos la coma como separador
				String[] datos = linea.split(ficheroSplit);
				
				//Usamos los datos para crear un nuevo objeto aeropuerto y lo agregamos al ArrayList
				listaAeropuertos.add(new Aeropuerto(datos[1], datos[2], datos[3], datos[4], datos[6], datos[7]));
				
			}
			
		} catch (Exception e) {}
		
	}

	public static void main(String[] args) {
		
		//Invocamos los métodos
		cargarFicheroDatos();
		leerArchivo();
		
		//Llamamos al JFrame, la ventana principal de la aplicación
		Vista frame = new Vista();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null) ;
		
		
	}

}
