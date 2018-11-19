# Procesos

## Contenidos

- [Aplicación](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#aplicaci%C3%B3n)
- [Servicio](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#servicio)
- [Proceso](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#proceso)
- [Hilo]
- [Programación concurrente]
- [Programación paralela]
- [Programación distribuida]

## Aplicación

Una **aplicación informática** es un tipo de software que permite al usuario realizar uno o más tipos de trabajo. Las aplicaciones pueden
haber sido desarrolladas a medida (para satisfacer las necesidades específicas de un usuario) o formar parte de un paquete integrado.
Las aplicaciones pertenecen al software de aplicación.

Las aplicaciones pueden tener distintas licencias de distribución como *freeware, shareware, trialware, etc*. Los procesadores de
texto y las hojas de cálculo son ejemplos de aplicaciones informáticas, mientras que los sistemas operativos o los programas de utilidades
(que cumplen tareas de mantenimiento) no forman parte de estos programas.

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/application-software-definition.jpg" width="400"/>
</p>

<p align="center">Clasificación de software</p>

Actualmente, con el uso de dispositivos móviles, se ha extendido el término *app*, que es un acortamiento de la palabra inglesa "application", y extendida por el éxito de la llamada App Store de Apple.

Los programadores de aplicaciones, a diferencia de los programadores de sistemas, no necesitan conocer a fondo el modo de funcionamiento
interno del hardware. Basta con que conozcan las necesidades de información de las aplicaciones y cómo usar el sistema operativo, para
conseguir satisfacer estas necesidades. `Los programas deben ser independientes del hardware específico que se utilice` y deben ser
transportados sin grandes problemas de adaptación a otras computadoras y otros entornos operativos.

Dentro de los programas de aplicación, puede ser útil una distinción entre **aplicaciones verticales**, de finalidad específica para un tipo muy delimitado de usuarios (médicos, abogados, arquitectos…), y **aplicaciones horizontales**, de utilidad para una amplísima gama de usuarios de cualquier tipo (suites ofimáticas, reproductores de archivos multimedia, editores de imagen...).

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  
  
  
## Servicio

Un **servicio** (nomenclatura usada en Windows) o **daemon** (nomenclatura usada en sistemas UNIX) es un tipo especial de proceso informático no interactivo, es decir, que se ejecuta en segundo plano en vez de ser controlado por el usuario directamente.

Sus características son:

- No disponen de una "interfaz" directa con el usuario.
- No hacen uso de las entradas y salidas estándar para comunicar errores o registrar su funcionamiento, sino que usan archivos del sistema en zonas especiales o utilizan otros daemon especializados en dicho registro.

El servicio está constantemente disponible y permanece inactivo hasta que es invocado para cumplir una tarea. Algunas actividades que pueden activar un servicio pueden ser la invocación de un servicio Web en un canal de comunicación, cuando se recibe un archivo a un directorio determinado, cuando se recibe un correo electrónico, entre otros.

Aplicación que gestiona los servicios en Windows (**services.msc**):

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/servicios_windows.jpg" width="600"/>
</p>

Los sistemas a menudo inician servicios en el tiempo de arranque, los cuales responderán a requerimientos de red, actividad de hardware u otros programas para realizar algunas tareas. Existen servicios que realizan tareas definidas en determinados horas programadas.

En sistemas Microsoft Windows, los servicios de Windows se ejecutan como procesos que usualmente no interaccionan con el monitor, teclado ni ratón, y pueden ser lanzados desde el arranque del sistema operativo.  
  
  
## Proceso

En el ámbito de la informática, el concepto de **proceso** se refiere a la ejecución de diversas instrucciones por parte del microprocesador, de acuerdo a lo que indica un programa. Un proceso puede entenderse informalmente como _un programa en ejecución_.

Para entender mejor lo que es un proceso, [A. S. Tanenbaum](https://es.wikipedia.org/wiki/Andrew_S._Tanenbaum) propone la analogía de un cocinero. El cocinero tiene la receta para un pastel y unos ingredientes. Se puede decir que la receta representa el programa (el algoritmo), el cocinero es el procesador y los ingredientes son las entradas del programa. El _proceso_ es la actividad que consiste en que el cocinero vaya leyendo la receta, obteniendo los ingredientes y horneando el pastel.

Cada proceso tiene su contador de programa, registros y variables, aislados de otros procesos. Incluso si el mismo programa es ejecutado 2 veces, el sistema operativo usará la misma región de memoria de código, debido a que dicho código no cambiará, a menos que se ejecute una versión distinta del programa.

Los procesos son creados y eliminados por el sistema operativo, así como también éste se debe hacer cargo de la comunicación entre procesos, pero lo hace a petición de otros procesos (interrupción o tiempo de reloj). El mecanismo por el cual un proceso crea otro proceso se denomina _bifurcación_ (_**fork**_).

En los sistemas operativos multihilo es posible crear tanto _hilos_ como _procesos_. La diferencia está en que un proceso solamente puede crear hilos para sí mismo y en que dichos hilos comparten toda la memoria reservada para el proceso.

Los procesos pueden ser **cooperativos** o **independientes**. Dos o más procesos pueden cooperar mediante señales de forma que uno obliga a detenerse a los otros hasta que reciban una señal para continuar.

Existen diversos caminos para la creación de un proceso informático, como el propio inicio del sistema, el pedido de un usuario o la llamada realizada por otro proceso. En cuanto a la finalización de un proceso, puede concretarse de manera normal, a partir de un error o por petición de otro proceso.

Un proceso informático, por otra parte, puede atravesar diferentes estados. Puede estar:

- **Nuevo** (Cuando es creado por primera vez)
- **En ejecución** (Cuando está utilizando el microprocesador)
- **Bloqueado** (Su ejecución requiere que se realice otro evento)
- **Listo o preparado** (Cuando libera el microprocesador para que pueda dedicarse a otro proceso)

Estados por los que atraviesa un proceso en su ciclo de vida:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/estados%20de%20procesos.png" width="600"/>
</p>

Por último, la **terminación** de un proceso es la última fase de su vida. La terminación puede darse por diferentes razones, las cuales se manifiestan a través del estado que atraviesa el proceso al momento de ser eliminado. Puede ser por salida normal, salida por error, por error fatal o eliminado por otro proceso.









