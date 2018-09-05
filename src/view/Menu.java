package view;

import java.util.ArrayList;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import categoria.view.CategoriaView;
import producto.control.Productos;
import producto.view.ProductoView;

public class Menu {

	private static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("1. Ingresar a las categorias");
			System.out.println("2. Ingresar a los productos");
			System.out.println("0. Salir");
			System.out.println("----");
			System.out.println();

			opcion = InputTypes.readInt("Su opcion?", scanner);

			if (opcion >= 0 && opcion <= 2) {
				return opcion;
			}
		}
	}

	public static void menuprincipal(Scanner scanner) throws NoExisteCategoria {
		boolean salir = false;
		Categorias categorias= new Categorias();
//		Categorias categorias = new Categorias(10);
		Productos productos = new Productos(10);

		CategoriaView categoriasView = new CategoriaView(categorias, productos, scanner);
		ProductoView productosView = new ProductoView(productos, categorias, scanner);

		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				categoria.view.CategoriaMenu.menu2(scanner, categoriasView);
				break;
			case 2:
				producto.view.ProductoMenu.menu(scanner, productosView);
				break;
			}
		}
	}
}
