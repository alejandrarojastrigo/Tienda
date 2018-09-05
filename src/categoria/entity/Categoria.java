package categoria.entity;

public class Categoria {

	private String nombreCategoria;
	private int codCategoria;
	private String descripcion;
	
	public Categoria(String nombreCategoria, int codCategoria, String descripcion) {
		super();
		this.nombreCategoria= nombreCategoria;
		this.codCategoria= codCategoria;
		this.descripcion= descripcion;
		
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [nombreCategoria=" + nombreCategoria + ", codCategoria=" + codCategoria + ", descripcion="
				+ descripcion + "]";
	}
	
}
