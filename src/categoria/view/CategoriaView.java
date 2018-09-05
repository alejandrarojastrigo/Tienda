package categoria.view;

import java.util.Iterator;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;
import producto.control.Productos;
import view.InputTypes;

public class CategoriaView {
	private Categorias categorias;
	private Scanner scanner;
	private Productos productos;
	
	public CategoriaView(Categorias categorias, Productos productos, Scanner scanner) {
		this.categorias=categorias;
		this.productos= productos;
		this.scanner=scanner;
	}
	
	public void add() {
		Categoria categoria;
		
		categoria=RegistroCategoria.ingresar(scanner);
		categorias.ingresar(categoria);
	}
	
	public void list() {
		for(Iterator<Categoria> i= categorias.getCategorias().iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
		/*for(int i=0;i< ((Categorias) categorias).getCantidad();i++) {
			System.out.println(categorias.getCategorias()[i]);
		}*/
	}

	public void delete() {
		int codigoCategoria = InputTypes.readInt("Por favor ingrese el codigo del producto", scanner);
		productos.eliminar(codigoCategoria);
	}
	
	/*public Categorias getCategorias() {
		return this.categorias;
	}*/
	
	public void listProducts() throws NoExisteCategoria {
		
		int codCategoria= InputTypes.readInt("Codigo categoria", scanner);
//		System.out.println(categorias.getCategorias()[categorias.buscarCategoria(codCategoria)]);
		System.out.println(categorias.getCategorias().get(categorias.buscar(codCategoria)));
		for(int i=0; i<productos.getCantidad();i++) {
			if(codCategoria==productos.getProductos()[i].getCodCategoria()) {
				System.out.println(productos.getProductos()[i]);
			}
		}
	}
}
