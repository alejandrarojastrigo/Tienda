package view;

import java.util.Scanner;

import categoria.entity.NoExisteCategoria;

public class Principal {

	public static void main(String[] args) throws NoExisteCategoria {
		
		Scanner scanner = new Scanner(System.in);
		
    	view.Menu.menuprincipal(scanner);
    	
		scanner.close();
		
	}
}
