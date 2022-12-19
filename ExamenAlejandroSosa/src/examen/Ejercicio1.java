package examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el támaño del triángulo a dibujar.
		System.out.println("Introduzca el tamaño del triángulo");
		// Asignamos a n el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle hasta que el valor de i supere al de num, a la vez que el de i aumenta.
		 * @i Se inicializa con valor 0.
		 */
		for (int i = 0; i <= num; i++) {
			/*
			 * Recorremos el bucle hasta que el valor de j sea igual al de i mientras que su valor va decrementando.
			 * En este bucle se imprimirá un espacio en blanco.
			 * @j Se inicializa con el mismo valor de num.
			 */
            for (int j = num; j > i; j--) System.out.print(" ");
            /*
             * Recorremos es bucle hasta que el valor de j supere al de i mientras va aumentando.
             * @j Se inicializa con valor 1.
             */
            for (int j = 1; j <=i; j++) {
            	// Se imprime el carácter *.
                System.out.print("*");
                // Se imprime un espacio en blanco.
                System.out.print(" ");
            }
            // Pasamos a la siguente línea.
            System.out.println("");
        }
		// Cerramos el escaner.
		sc.close();
	}

}
