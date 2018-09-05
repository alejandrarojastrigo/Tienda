package categoria.view;

import java.util.Scanner;

import categoria.entity.Categoria;
import view.InputTypes;

public class RegistroCategoria {

	
	public static Categoria ingresar(Scanner scanner) {
		
	    String nombreCategoria= InputTypes.readString("Ingrese el nombre de la categoria", scanner);
	    int codCategoria= InputTypes.readInt("Ingrese el codgio de la categoria", scanner);
		String descripcion= InputTypes.readString("Descripcion: ", scanner);
		
		return new Categoria(nombreCategoria, codCategoria, descripcion);
		
	}
	
}
