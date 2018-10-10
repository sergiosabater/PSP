
public class Oficial extends Operario{
	
	public Oficial() {
		super();
	}
	
	public Oficial(String nombre) {
		super();
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return super.toString()+" -> Oficial";
	}
}
