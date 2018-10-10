
public class Operario extends Empleado{
	
	public Operario() {
		super();
	}
	
	public Operario(String nombre) {
		super();
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return super.toString()+" -> Operario";
	}
	
}
