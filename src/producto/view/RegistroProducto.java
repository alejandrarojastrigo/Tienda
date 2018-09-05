package producto.view;

import java.util.ArrayList;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import producto.entity.Producto;
import view.InputTypes;

public class RegistroProducto {
	
public static Producto ingresar(Scanner scanner,Categorias categorias) throws NoExisteCategoria {
	
	    int valor=-1;
	    int codProducto=InputTypes.readInt("Ingrese el código del producto", scanner);
		String nombreProducto= InputTypes.readString("Nombre: ", scanner);
		double precio=InputTypes.readDouble("Precio: ", scanner);
		String descripcion= InputTypes.readString("Descripcion: ", scanner);
		
		
		valor= InputTypes.readInt("Codigo Categoria: ", scanner);
		try {
			if(categorias.buscar(valor)==-1)
			{
				throw new NoExisteCategoria();
			}
			int codCategoria=valor;
			return new Producto(codProducto, nombreProducto, precio, descripcion, codCategoria);
		} catch(NoExisteCategoria e)
		{
			System.out.println("Esa categoria no existe, por favor ingrese de nuevo");
		}
		return null;
	}

}
