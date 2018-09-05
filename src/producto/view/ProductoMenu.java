package producto.view;

import java.util.Scanner;

import categoria.entity.NoExisteCategoria;
import view.InputTypes;

public class ProductoMenu {
	
	
	private static int encabezado(Scanner scanner) {
		int opcion;
		
		while(true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("1. Ingresar producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Eliminar producto");
			System.out.println("0. Salir");
			System.out.println();
			
			opcion=InputTypes.readInt("Su opcion?", scanner);
			
			if(opcion>=0 && opcion<=3) {
				return opcion;
			}
		}
		
	}

	public static void menu(Scanner scanner, ProductoView productosView) throws NoExisteCategoria {
		boolean salir=false;
		
		while(!salir) {
			switch(encabezado(scanner)) {
			case 0:
			salir=true;
			break;
			case 1:
			productosView.add();
			break;
			case 2:
				productosView.list();
				break;
			case 3:
				productosView.delete();
				break;
			}
		}
	}


}
