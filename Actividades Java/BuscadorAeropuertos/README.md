# Buscador de Aeropuertos en Java

Buscar una base de datos free con todos los aeropuertos del mundo, el formato más sencillo para nuestro caso sería XML, JSON o CSV.
Buscar y guardar en nuestro proyecto de Github los enlaces que hemos encontrado:

https://openflights.org/data.html

http://ourairports.com/data/

https://booksite.elsevier.com/9780340741528/appendices/data-c/airports.xls

http://www.partow.net/downloads/GlobalAirportDatabase.zip  
  
  
## Diseño de la aplicación

1. Guardar el fichero con los datos en nuestro sistemas de archivos.

2. Leer el fichero desde nuestro sistema de archivos y convertir el formato CSV en un array de aeropuertos, podemos buscar en internet
formas de recorrer un texto, leer linea a linea y pasar la información a un array.

3. Crear un panel desde donde el usuario pueda introducir un dato ( ej: alicante, spain, VLC ) y mostrará los resultados bajo de esta
caja de texto.

4. Al pinchar sobre uno de los aeropuertos se abrirá el navegador por defecto del usuario mostrándole la posición
del aeropuerto en un mapa de GoogleMaps u OpenStreetMap.  
  
  
Interfaz del programa:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/Aeropuertos_Interfaz.JPG"/>
</p>

Contemplamos los posibles errores y mostramos mensajes de advertencia al usuario:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/Aeropuertos_Error.JPG"/>
</p>

Ir a [código de la aplicación](https://github.com/sergiosabater/PSP/tree/master/Actividades%20Java/BuscadorAeropuertos)





