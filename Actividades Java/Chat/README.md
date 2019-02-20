# Chat Cliente / Servidor en Java
## Aplicación para chatear - Uso de Sockets e hilos de programación

La aplicación ha sido desarrollada en Java, empleando una interfaz gráfica de usuario para hacerlo más amigable. Hemos empleado el uso de Sockets cliente-servidor, los cuales se comunican a través de objetos, con lo cual hemos unificado los enunciados de las actividades.

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/Chat_Cliente.PNG" width="600"/>
</p>

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/Chat_Servidor.PNG" width="600"/>
</p>


## Funcionamiento de la aplicación
Desde la aplicación Cliente, debemos introducir nuestra IP y la IP del servidor. (En las fotos de ejemplo es la IP es la misma pues se trata del mismo ordenador).

Una vez realizado esto, debemos introducir nuestro nick de usuario y un mensaje. Al pulsar el botón enviar, se envia un objeto hacia el Servidor que contiene toda la información que le hemos suministrado desde el cliente. Dicho objeto se ha definido con el nombre de **Paquete**. El Servidor recibe dicho paquete y lo descompone, extrayendo de él el nickname y el mensaje. También identifica la IP de origen, porque es ahí donde debe devolver el mensaje. Una vez que ha recibido el objeto, le añade al mensaje de dicho objeto lo siguiente: `Servidor: Mensaje rebicido OK`, y lo manda de vuelta al Cliente. De esta forma cuando el cliente recibe el objeto, verá en su área de texto que el servidor le ha respondido.

Es una forma de ver cómo se pueden comunicar sockets mediante objetos implementando un chat.

## Posibles mejoras

La aplicación no es perfecta y se puede mejorar. Se puede realizar una comprobación en los campos de las IP para que el formato sea el correcto. La configuración de las IP se puede establecer mediante un botón que dirija a una ventana de configuración.
Hemos observado que al abrir varios clientes, los mensajes solo aparecen en una ventana de ellos, pues al tratarse de la misma IP siempre lo manda al mismo Cliente. También el Cliente debería ver todo lo que se escribe en el Servidor desde su área de texto.







Ir a [código de la aplicación](https://github.com/sergiosabater/PSP/tree/master/Actividades%20Java/Chat)
