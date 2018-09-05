package producto.control;

import producto.entity.Producto;

public class Productos {

	private Producto[] productos;
	private int cantidad;
	private int ultimo;
	
	public Productos(int tamaño) {
		productos= new Producto[tamaño];
		cantidad=0;
		ultimo=-1;
	}
	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
		productos[++ultimo]=producto;
		cantidad++;
	}
	public void eliminar(int codProducto) {
		int indice= buscar(codProducto);
		
		if(indice>=0) {
			if(indice!= ultimo) {
				for(int i=indice;i<ultimo;i++) {
					//Recorrer todos los elementos a partir de i
					productos[i]=productos[i+1];
				}
			}
			productos[indice] = null;
			ultimo--;
			cantidad--;
		}
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	private int buscar(int codProducto) {
		int indice=-1;
		int i=0;
		while(i<= ultimo) {
			if(codProducto==productos[i].getCodProducto()) {
				indice=i;
				break;
			}
			i++;
		}
		return indice;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
}
