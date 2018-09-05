package producto.view;

import java.util.ArrayList;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class ProductoView {
	
	private Productos productos;
	private Scanner scanner;
	private Categorias categorias;
	
	public ProductoView(Productos productos,  Categorias categorias, Scanner scanner) {
		this.productos= productos;
		this.scanner=scanner;
		this.categorias = categorias;
	}
	
	public void add() throws NoExisteCategoria {
		Producto producto;
		
		producto=RegistroProducto.ingresar(scanner,categorias);
		if(producto != null) {
			productos.ingresar(producto);
		}
	}
	
	public void list() {
		int codCategoria=0;
		int indiceCategoria=0;
          for(int i=0;i<= productos.getCantidad();i++) {

				System.out.println(productos.getProductos()[i]);
				codCategoria= productos.getProductos()[i].getCodCategoria();
				try {
					indiceCategoria= categorias.buscar(codCategoria);
					System.out.println(categorias.getCategorias().get(indiceCategoria));
				}
				catch( NoExisteCategoria e) {
					e.printStackTrace();
				}
			}
//		}
	}

	public void delete() {
		int codigoProducto = InputTypes.readInt("Por favor ingrese el codigo del producto", scanner);
		productos.eliminar(codigoProducto);
		
	}

}
