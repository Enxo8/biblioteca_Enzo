import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int total;

		System.out.println("Programa que suma 2 numeros enteros introducidos por teclado");
		System.out.println("Introduzca el primero");
		num1 = Integer.parseInt(sc.next());
		System.out.println("Introduzca el segundo");
		num2 = Integer.parseInt(sc.next());
		
		total = num1 + num2;
		
		System.out.println("El resultado de la suma es: " + total);
		
	}

}
