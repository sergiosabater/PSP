# Tareas de multiprocesos, definir, desarrollar, poner ejemplos y enlaces 

## Contenidos

- [Aplicación](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#aplicaci%C3%B3n)
- [Servicio](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#servicio)
- [Proceso](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#proceso)
- [Hilo](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#hilo)
- [Programación concurrente](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#programaci%C3%B3n-concurrente)
- [Programación paralela](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#programaci%C3%B3n-paralela)
- [Programación distribuida](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#programaci%C3%B3n-distribuida)

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

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  

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

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  

## Hilo
Un **hilo** (del inglés _thread_), es una secuencia muy pequeña de tareas encadenadas que puede ser ejecutada por un sistema operativo. Básicamente un hilo es una tarea que puede ser ejecutada al mismo tiempo que otra tarea. Los hilos de ejecución que comparten los mismos recursos, junto con estos mismo recursos, son en conjunto conocidos como un **proceso** (definido anteriormente).

Los hilos de ejecución de un mismo proceso comparten los recursos y cualquiera de estos hilos puede modificar estos recursos. Cuando un hilo modifica un dato en la memoria, los otros hilos acceden a ese dato modificado inmediatamente.

Un hilo posee su _contador de programa_, _la pila de ejecución_ y el _estado de la CPU_ (incluyendo el valor de los registros).

Mientras al menos uno de sus hilos de ejecución siga activo, un proceso continúa en ejecución. Cuando el proceso finaliza, todos sus hilos de ejecución también han terminado.

Podemos decir que un proceso es un hilo de ejecución, conocido como **Monohilo**. Los hilos son generados a partir de la creación de un proceso. Las ventajas de los hilos se dan cuando hablamos de **Multihilos**, que es cuando un proceso tiene múltiples hilos de ejecución los cuales realizan actividades distintas, que pueden o no ser cooperativas entre sí. Los beneficios de los hilos se derivan de las implicaciones de rendimiento.

Los **estados de un hilo** son iguales a los de un proceso, por tanto, un hilo puede estar en estado _preparado_, _bloqueado_ o _activo_ en un cierto instante de tiempo. La conmutación entre hilos de un proceso es menos costosa que la conmutación de procesos, por tanto, el planificador tiende a conmutar entre hilos de un proceso siempre que el proceso en su conjunto no haya agotado el tiempo máximo de asignación del procesador.

Los hilos nos permiten `aprovechar la existencia de más de un procesador en el sistema`, puesto que podemos asignar un hilo a cada uno de los procesadores que haya disponibles. Si hay más de un procesador, dos hilos de un mismo proceso pueden estar en estado activo simultáneamente. Por tanto, la programación con hilos nos permite sacar partido de las arquitecturas de multiprocesador que predominan en la actualidad.

Ejemplo de implementación de hilos en Java:

Extendiendo la clase Thread

```java
public class NumberThread extends Thread {
 
int num;
 
public NumberThread(int n){
num = n;
}

```

```java
public class Numbers {

	public static void main(String[] args) {
		NumberThread n1, n2, n3, n4, n5, n6;
		
		n1 = new NumberThread(1); n1.start();
		n2 = new NumberThread(2); n2.start();
		n3 = new NumberThread(3); n3.start();
		n4 = new NumberThread(4); n4.start();
		n5 = new NumberThread(5); n5.start();
    }
  }

```

Como comentamos anteriormente, los hilos de un mismo proceso comparten el mismo espacio de memoria, por tanto, dos hilos del mismo proceso pueden compartir estructuras de datos y variables.

Veamos un ejemplo de multiprogramación:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/Uso_del_procesador_hilos.svg.png" width="600"/>
</p>

Con multiprogramación podemos ejecutar diferentes procesos a la vez en una CPU. Incluso podemos desdoblar un determinado proceso en diferentes hilos.
  
  

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  
  
  
## Programación concurrente

La **programación concurrente** es la ejecución simultánea de múltiples tareas interactivamente. Estas tareas pueden ser un conjunto de procesos o hilos de ejecución creados por un único programa. Las tareas se pueden ejecutar en una sola CPU (multiprogramación), en varios procesadores, o en una red de computadores distribuidos.

La **concurrencia** es una propiedad de los sistemas en la cual los procesos de un cómputo se hacen simultáneamente, y pueden interactuar entre ellos. Los cálculos (operaciones) pueden ser ejecutados en múltiples procesadores, o ejecutados en procesadores separados físicamente o virtualmente en distintos hilos de ejecución.

El diseño de sistemas concurrentes a menudo implican la búsqueda de técnicas confiables para coordinar su ejecución, el intercambio de información, asignación de memoria, y una ejecución programada para minimizar la respuesta de tiempo y maximizar el rendimiento o cantidad de datos que se pueden transmitir por un canal u otro dispositivo de entrada.

Conviene distinguir entre programación concurrente y programación paralela. Básicamente podríamos decir que:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/concurrencia_vs_paralelismo.PNG" width="600"/>
</p>

  
  

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  
  
  
## Programación paralela

Existen dos tipos de definiciones de **programación paralela**:

- Según la **definición tradicional**: Es el uso de varios computadores trabajando juntos para resolver una tarea común. En este caso, cada computador trabaja en una `porción del problema`, y los procesos pueden intercambiar datos y comunicarse a través de la memoria y una red de comunicación.

- Según la **definición actual**: Es el uso de varios procesadores trabajando juntos para resolver una tarea común. Estos procesadores `pueden estar dentro del mismo ordenador` y tener `distintas naturalezas`(**heterogénesis**). O pueden estar dentro del mismo chip (multicore, GPUs, etc).

Vídeo explicativo sobre la programación paralela:

[![PROGRAMACIÓN PARALELA](https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/videoProgParalela.PNG)](https://www.youtube.com/watch?v=QgvzDdFpARM)
  
  
[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  
  
  
## Programación distribuida

En la **programación distribuida** los distintos componentes de una aplicación se ejecutan en entornos separados, normalmente en diferentes plataformas conectadas a través de una red.

La **distribución** se refiere a la construcción de software `por partes`, a las cuales le son asignadas una serie de _responsabilidades_ dentro de un sistema. Esta distribución se refiere a las partes o componentes que se encuentran en máquinas diferentes. Sin embargo, para realizar esta "separación física" primero se debe tener claro la "separación lógica" de las partes de una aplicación, esto quiere decir que programáticamente existe una forma de separar o agrupar los componentes.

Cuando se habla de **distribución lógica**, se entiende que la separación se realiza por "capas", mientras que en la **distribución física** se usa el término de separación por "niveles". La separación por capas y niveles es parte de la arquitectura del sistema, y es definida por el _arquitecto_ de la aplicación.

Las aplicaciones distribuidas independientemente  de su arquitectura, comparten ciertas caracteristicas como son:

- Concurrencia
- Topologia de red
- Ubicacion de la lógica
- Homogeneidad de las plataformas
- Seguridad

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/computaciondistribuida.jpg" width="400"/>
</p>
  

[[↑ Contenidos]](https://github.com/sergiosabater/PSP/blob/master/Documentos/Procesos.md#contenidos)  
  
  
  
  
- - -  
  
  



