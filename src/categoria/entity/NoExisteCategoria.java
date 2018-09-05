package categoria.entity;

public class NoExisteCategoria extends Exception{

	private static final long serialVersionUID=1L;
	
	public NoExisteCategoria() {
		super("No existe categoria");
	}
}
