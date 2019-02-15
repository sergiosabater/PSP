# YouTube Downloader - Aplicación para descargar vídeos de YouTube simultáneamente

La aplicación ha sido desarrollada en Java. Sirve para realizar múltiples descargas de vídeos de YouTube a la vez, utilizando para ello la programación en hilos de ejecución.

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/YouTubeDownloader.JPG" width="600"/>
</p>


## Desarrollo de la aplicación

Para desarrollar la aplicación hemos utilizado las librerías de VGet para poder descargar los vídeos de YouTube. En este caso hemos optado por utilizar un proyecto Maven en Eclipse e importar las dependencias.

Así es como queda el archivo pom.xml importando las dependencias de VGet:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>YouTubeApp</groupId>
  <artifactId>YouTubeApp</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <build>
    <sourceDirectory>src</sourceDirectory>
    <plugins>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
  <dependencies>
  	<dependency>
            <groupId>com.github.axet</groupId>
            <artifactId>vget</artifactId>
            <version>1.1.33</version>
    </dependency>
  </dependencies>
</project>

```

Hemos creado cuatro clases, una de ellas es la clase principal, la **Main**, desde la cual se ejecuta el programa.

- La clase **Interfaz** dispone de la interfaz del programa. Al pulsar sobre los diferentes botones se ejecutarán los hilos correspondientes a cada una de las URL que están ingresadas en los TextBox. Para ello hemos controlado los posibles errores que puedan producirse si el usuario no introduce una URL y pulsa sobre Descargar. En este caso una variable booleana nos ayudará para controlar si existe texto dentro del campo URL.

Fragmento de código que muestra cómo se implementa la acción de un botón:

```java
btnDescargar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				url = txtURL1.getText();
				crearDirectorio();
				if(valid) {
					DownloadThread v1 = new DownloadThread(url, path, progressBar1, Lbl_1);
					progressBar1.setBackground(Color.RED);
					v1.start();
				}else {
					progressBar1.setBackground(Color.GRAY);
				}
			}
		});
```


También disponemos de un método llamado **crearDirectorio()**, el cual comprueba si el directorio existe, y si no se pregunta al usuario si desea crearlo. En caso afirmativo, lo crea y establece la variable booleana *valid* a 'true' (que nos sirve para controlar que todo es válido antes de iniciar los hilos).

Método crearDirectorio():

´´´java
public static void crearDirectorio() {
		
		File folder = new File (path);
		
		if(!folder.exists()) {

				int variable = JOptionPane.showConfirmDialog(null, "La ruta "+path+" no existe\n¿Desea crearla?", "Directorio no existe", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(variable == 0) {
					folder.mkdirs();
					valid = true;
				}else {
					valid = false;
				}
				
		}else {
			valid = true;
		}
	}
´´´

- La clase **DownloadThread** la usamos para crear un hilo de ejecución del programa de descarga. El constructor de la clase recibe varios parámetros, los cuales son la URL, el path donde se guardará el archivo de vídeo descargado, la barra de estado correspondiente a esa URL, y la label asociada también a la misma URL. Controlamos la excepción de si no se produce la descarga del vídeo, informando al usuario a través de un mensaje.

Constructor y sobreescritura del método run() de la clase DownloadThread:

```java
public DownloadThread(String url, String path, Object bar, Object label ) {
		super();
		this.url = url;
		this.path = path;
		this.progBar = (JProgressBar) bar;
		this.lbl = (JLabel) label;
	}

	@Override
	public void run() {
		
		try {
            String url = this.url;
            String path = this.path;
            this.progBar.setValue(0);
            this.lbl.setText("Descargando...");
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
            this.lbl.setText("Completado!!!");
            this.progBar.setBackground(Color.GREEN);
            

        } catch (Exception e) {
        	this.lbl.setText("ERROR");
        	JOptionPane.showMessageDialog(null, "Se ha producido un error. Compruebe la dirección URL", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        }
	}

```

- La clase **Configuracion** es otra interfaz, una ventana que aparece al pulsar el botón 'Configuración'. Desde aquí podremos modificar la ruta de descarga del vídeo para poder introducir la que nosotros queramos. Cabe mencionar que la varible *path* es pública y estática para que pueda ser accedida por otras clases.


## Interfaz del programa

La interfaz del programa es bastante intuitiva para el usuario. Ha sido creada en Swing. En dicha interfaz aparecen cuatro diferentes GroupBox donde el usuario debe pegar la dirección URL correspondiente al vídeo de YouTube que desea descargar. Después, al pulsar el botón 'Descargar' comenzará el proceso de descarga, que iniciará con la ProgressBar o barra de progreso en color rojo. Cuando el proceso finalice, si todo se ha ejecutado correctamente, no se mostrará ningún error y la progress bar aparecerá en color verde. Cabe mencionar que se podran pulsar uno o varios botones a la vez y así realizar una descarga simultánea de varios vídeos.

Adicionalmente, hemos agregado un botón llamado `Configuración` que nos permitirá modificar la ruta o path donde se almacenará el vídeo que vayamos a descargar.



Ir a [código de la aplicación](https://github.com/sergiosabater/PSP/tree/master/Actividades%20Java/YouTubeDownloader)





