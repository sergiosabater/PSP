# YouTube Downloader - Aplicación para descargar vídeos de YouTube simultáneamente

La aplicación ha sido desarrollada en Java. Sirve para realizar múltiples descargas de vídeos de YouTube a la vez, utilizando para ello la programación en hilos de ejecución.

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/YouTubeDownloader.JPG" width="600"/>
</p>


## Desarrollo de la aplicación

Para desarrollar la aplicación hemos utilizado las librerías de VGet para poder descargar los vídeos de YouTube. En este caso hemos optado por utilizar un proyecto Maven en Eclipse e importar las dependencias.

Así como queda el archivo pom.xml importando las dependencias de VGet:

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

La clase **Interfaz** dispone de la interfaz del programa. Al pulsar sobre los diferentes botones se ejecutarán los hilos correspondientes a cada una de las URL que están ingresadas en los TextBox. Para ello hemos controlado los posibles errores que puedan producirse si el usuario no introduce una URL y pulsa sobre Descargar. En este caso una variable booleana nos ayudará para controlar si existe texto dentro del campo URL. También disponemos de un método llamado **crearDirectorio()**, el cual comprueba si el directorio existe, y si no se pregunta al usuario si desea crearlo. En caso afirmativo, lo crea y establece la variable booleana *valid* a 'true' (que nos sirve para controlar que todo es válido antes de iniciar los hilos).

La clase **DownloadThread** la usamos para crear un hilo de ejecución del programa de descarga. El constructor de la clase recibe varios parámetros, los cuales son la URL, el path donde se guardará el archivo de vídeo descargado, la barra de estado correspondiente a esa URL, y la label asociada también a la misma URL.

  
  
## Interfaz del programa

Después hemos creado una interfaz Swing para el programa, donde aparecen cuatro diferentes GroupBox donde el usuario debe pegar la dirección URL correspondiente al vídeo de YouTube que desea descargar. Después al pulsar el botón 'Descargar' comenzará el proceso de descarga

(En desarrollo...)


Ir a [código de la aplicación](https://github.com/sergiosabater/PSP/tree/master/Actividades%20Java/YouTubeDownloader)





