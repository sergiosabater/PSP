
public class Tecnico extends Operario{
	
	public Tecnico() {
		super();
	}
	
	public Tecnico(String nombre) {
		super();
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return super.toString()+" -> Tecnico";
	}
	
}
