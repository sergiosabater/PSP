public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private String codAeropuerto;
	private String latitud;
	private String longitud;
	
	
	public Aeropuerto() {
		
	}
	
	public Aeropuerto(String nombre, String ciudad, String pais, String codAeropuerto, String latitud, String longitud) {
		this.nombre=nombre;
		this.ciudad=ciudad;
		this.pais=pais;
		this.codAeropuerto=codAeropuerto;
		this.latitud=latitud;
		this.longitud=longitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setStringitud(String longitud) {
		this.longitud = longitud;
	}

	public String getCodAeropuerto() {
		return codAeropuerto;
	}

	public void setCodAeropuerto(String codAeropuerto) {
		this.codAeropuerto = codAeropuerto;
	}

}
