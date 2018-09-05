package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import categoria.control.Categorias;
import producto.control.Productos;

public class InputTypes {
	Scanner scanner= new Scanner(System.in);


public static int readInt(String msg, Scanner scanner) {
	int valor=0;
	while(true) {
	try {
		System.out.println(msg);
		valor=scanner.nextInt();
		break;
	}
	catch(InputMismatchException e) {
		System.out.println("Usted ingreso valores no numericos");
		scanner.nextLine();
    }
	   }
return valor;
}


public static String readString(String msg, Scanner scanner2) {
	
		System.out.println(msg);
		String valor=scanner2.next();
		scanner2.nextLine();
    
return valor;
}


public static double readDouble(String msg, Scanner scanner) {
	double valor=0;
	while(true) {
	try {
		System.out.println(msg);
		valor=scanner.nextDouble();
		break;
	}
	catch(InputMismatchException e) {
		System.out.println("Usted ingreso valores no numericos");
		scanner.nextLine();
    }
	   }
return (int) valor;
}

}
