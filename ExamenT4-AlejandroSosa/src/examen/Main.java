package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tirada1 = 0; // Esta variable es el número del dado que ha sacado cada jugador en la primera tirada.
		int tirada2 = 0; // Esta variable es el número del dado que ha sacado cada jugador en la segunda tirada.
		String nomJ1; // Esta variable es el nombre del primer jugador.
		String nomJ2; // Esta variable es el nombre del segundo jugador.
		char car; // Esta es la variable que utilizaremos para iniciar cada turno.
		// Creamos un objeto de la clase Funciones.
		Funciones obj = new Funciones();
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Mostramos por pantalla un mensaje de bienvenida a la carrera.
		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		// Pedimos al usuario el valor mínimo que podrá sacar el dado.
		System.out.println("Introduzca el número mínimo del dado");
		// Asignamos a la variable minDado de la clase Funciones el valor escrito por el usuario. 
		Funciones.minDado = sc.nextInt();
		// Pedimos al usuario el valor máximo que podrá sacar el dado.
		System.out.println("Introduzca el número máimo del dado");
		// Asignamos a la variable maxDado de la clase Funciones el valor escrito por el usuario.
		Funciones.maxDado = sc.nextInt();
		// Pedimos al usuario el nombre del primer/a jugador/a.
		System.out.println("¿Cual es el nombre del jugador 1?");
		// Asignamos a nomJ1 el nombre escrito por el usuario.
		nomJ1 = sc.next();
		/*
		 * Recorremos el bucle mientras el segundo nombre introducido sea igual al primero.
		 */
		do {
			// Pedimos al usuario el nombre del segundo/a jugador/a.
			System.out.println("¿Cual es el nombre del jugador 2?");
			// Asignamos a nomJ2 el nombre escrito por el usuario.
			nomJ2 = sc.next();
			// Si el valor de nomJ1 es igual al de nomJ2 mostramos por pantalla un mensaje de error.
			if(nomJ1.equals(nomJ2)) System.out.println("Los dos jugadores no se pueden llamar igual");
		}while(nomJ1.equals(nomJ2));
		
		// Mostramos por pantalla un mensaje de comienzo de carrera.
		System.out.println("¡COMENCEMOS A JUGAR!");
		// Llamamos a la función pintaPista de la clase Funciones.
		Funciones.pintaPista();;
		/**
		 * Recorremos el bucle hasta que la función esGanador de la clase Funciones devuelva un nombre.
		 */
		while(obj.esGanador(nomJ1, nomJ2).equals("")) {
			// Pedimos al usuario que pulse una tecla para iniciar su turno.
			System.out.println("Pulsa cualquier letra para la siguiente ronda");
			// Asignamos a car el valor escrito.
			car = sc.next().charAt(0);
			// Mostramos por pantalla un mensaje diciendo de quien es el turno.
			System.out.println("Turno para el jugador 1 "+ nomJ1);
			// Asignamos a tirada1 el valor devuelto por la función tiraDados de la clase Funciones.
			tirada1 = Funciones.tiraDados();
			// Mostramos por pantalla el valor de la primera tirada.
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			// Asignamos a tirada2 el valor devuelto por la función tiraDados de la clase Funciones.
			tirada2= Funciones.tiraDados();
			// Mostramos por pantalla el valor de la segunda tirada.
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			// Si el valor devuelto por la función sumaDeNumerosEsPrimo de la clase Funciones es true. 
			if(Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2)==true) {
				// Sumamos a fichaJ1 el valor que tenía más el de tirada1 y tirada2.
				Funciones.fichaJ1+=tirada1+tirada2;
				// Mostramos por pantalla un mensaje de que la jugada ha sido válida.
				System.out.println("La jugada es válida");
			// Si no ocurre lo anterior, mostramos por pantalla dos mensajes. Uno diciendo que la jugada no ha sido válida y otro de que no suma puntos.
			}else {
				System.out.println("La jugada no es válida");
				System.out.println("No suma puntos ya que la suma de los dos números no es primo");
			}
			// Saltamos la línea.
			System.out.println();
			// LLamamos a la función pintaPista de la clase Funciones.
			Funciones.pintaPista();
			// Llamamos a la función imprimeComoVaLacarrera de la clase Funciones utiilizando el objeto creado. 
			obj.imprimeComoVaLacarrera(nomJ1, nomJ2);
			// Pedimos al usuario que pulse una tecla para iniciar su turno.
			System.out.println("Pulsa cualquier letra para la siguiente ronda");
			// Asignamos a car el valor escrito.
			car = sc.next().charAt(0);
			// Mostramos por pantalla un mensaje diciendo de quien es el turno.
			System.out.println("Turno para el jugador 2 "+ nomJ2);
			// Asignamos a tirada1 el valor devuelto por la función tiraDados de la clase Funciones.
			tirada1 = Funciones.tiraDados();
			// Mostramos por pantalla el valor de la primera tirada.
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			// Asignamos a tirada2 el valor devuelto por la función tiraDados de la clase Funciones.
			tirada2= Funciones.tiraDados();
			// Mostramos por pantalla el valor de la segunda tirada.
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			// Si el valor devuelto por la función sumaDeNumerosEsPrimo de la clase Funciones es true. 
			if(Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2)==true) {
				// Sumamos a fichaJ1 el valor que tenía más el de tirada1 y tirada2.
				Funciones.fichaJ2+=tirada1+tirada2;
				// Mostramos por pantalla un mensaje de que la jugada ha sido válida.
				System.out.println("La jugada es válida");
			// Si no ocurre lo anterior, mostramos por pantalla dos mensajes. Uno diciendo que la jugada no ha sido válida y otro de que no suma puntos.
			}else {
				System.out.println("La jugada no es válida");
				System.out.println("No suma puntos ya que la suma de los dos números no es primo");
			}
			// Saltamos la línea.
			System.out.println();
			// LLamamos a la función pintaPista de la clase Funciones.
			Funciones.pintaPista();
			// Llamamos a la función imprimeComoVaLacarrera de la clase Funciones utiilizando el objeto creado. 
			obj.imprimeComoVaLacarrera(nomJ1, nomJ2);
		}
		// Mostamos por pantalla un mensaje con el ganador o los ganadores de la carrera.
		System.out.println(obj.esGanador(nomJ1, nomJ2));
		
	}

}
