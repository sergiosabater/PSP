public class Directivo extends Empleado{
	
	public Directivo() {
		super();
	}
	
	public Directivo(String nombre) {
		super();
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return super.toString()+" -> Directivo";
	}
	
}
