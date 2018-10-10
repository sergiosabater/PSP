
public class Empleado {
	
	//Atributos
	
	protected String nombre;
	
	
	//Constructores
	
	public Empleado() {}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	
	//Getters & setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//Redefinición del método toString()
	
	@Override
	public String toString() {
		return "Empleado "+nombre;
	}
	
}
