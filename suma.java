package calculadora;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		try(Scanner teclado = new Scanner (System.in)) {
		// TODO Auto-generated method stub
		int num1=0, num2=0,operacion=0;
		System.out.println("Primer numero");
		num1=teclado.nextInt();
		System.out.println("Segundo numero");
		num2=teclado.nextInt();
		operacion=num1+num2;
		System.out.println("La suma da: "+operacion);
	}
		
	}
}
