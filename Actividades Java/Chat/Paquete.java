import java.io.Serializable;


//Esta clase servirá para implementar los datos que enviamos

public class Paquete implements Serializable {
	
	String ipOrigen; //La IP de origen
	String ipDestino; //La IP de destino
	String cliente; // El nickname
	String mensaje; // Nuestro mensaje
	
	
	
	public Paquete() {
		super();
	}

	public Paquete(String ipOrigen, String ipDestino, String cliente, String mensaje) {
		super();
		this.ipOrigen = ipOrigen;
		this.ipDestino = ipDestino;
		this.cliente = cliente;
		this.mensaje = mensaje;
	}

	public String getIpOrigen() {
		return ipOrigen;
	}

	public void setIpOrigen(String ipOrigen) {
		this.ipOrigen = ipOrigen;
	}

	public String getIpDestino() {
		return ipDestino;
	}

	public void setIpDestino(String ipDestino) {
		this.ipDestino = ipDestino;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
