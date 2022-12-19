package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		int cifra=1; // Esta variable es el dígito que tiene el número introducido.
		int pares; // Esta variable es la cantidad de cifras pares que tiene el número.
		int impares; // Esta variable es la cantidad de cifras impares que tiene el número.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de num.
		System.out.println("Introduzca un número entero");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle mientras el valor de num sea mayor o igual a 0.
		 */
		while(num>=0) {
			// Inicializamos el valor de pares a 0.
			pares = 0;
			// Inicializamos el valor de impares a 0.
			impares = 0;
			/*
			 * Recorremos el bucle mientras que num sea mayor a 9.
			 * @i Se inicializa con valor 10.
			 */
			for (int i = 10; num>9;) {
				// Asignamos a cifra el valor del resto de la división entre num y i.
				cifra = num%i;
				// Si el valor de cifra es par aumentamos el valor de la variable pares, sino aumentamos el de la variable impares.
				if(cifra%2==0) pares++;
				else impares++;
				// Asignamos a num su valor entre el valor actual de i.
				num/=i;
			}
			// Si el valor de num es par aumentamos el de la variable pares, sino aumentamos el de la variable impares.
			if(num%2==0) pares++;
			else impares++;
			// Mostramos por pantalla un mensaje con la cantidad de cifras pares e impares.
			System.out.println("Ese número posee " + pares + " cifras pares y " + impares + " cifras impares");
			// Pedimos al usuario el siguiente valor de num.
			System.out.println("Introduzca el siguiente número entero");
			// Asignamos a num el nuevo valor escrito por el usuario.
			num = sc.nextInt();
		}		
		// Cerramos el escaner.
		sc.close();
	}

}
