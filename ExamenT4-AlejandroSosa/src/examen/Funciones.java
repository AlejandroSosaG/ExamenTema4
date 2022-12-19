package examen;

public class Funciones {
	final static int tamCircuito = 11; // Esta variable es el tamaño del circuito.
	static int fichaJ1 = 0; // Esta es la variable que usaremos para guardar la puntuación del jugador 1.
	static int fichaJ2 = 0; // Esta es la variable que usaremos para guardar la puntuación del jugador 2.
	static int minDado; // Esta variable es el valor mínimo que tendrá el dado.
	static int maxDado; // Esta variable es el valor máximo que tendrá el dado.
	
	/**
	 * Esta función devuelve un valor aleatorio del dado.
	 * @return
	 */
	public static int tiraDados() {
		int dado; // Esta variable es el valor del dado.
		// Asignamos a la vairable dado un valor aleatorio entre maxDado y minDado.
		dado = (int) (Math.random()*maxDado+minDado);
		// Devolvemos el valor de dado.
		return dado;
	}
	
	/**
	 * Esta función se encarga de pintar la pista con todos los números y la posición de cada jugador.
	 */
	public static void pintaPista() {
		/*
		 * Recorremos el bucle hastaque el valor de i supere al de tamCircuito, mientras va aumentando. 
		 */
		for (int i = 0; i <= tamCircuito; i++) {
			// Mostramos por pantalla el valor actual de i.
			System.out.print(i);
			// Escibimos un espaciado entre números.
			System.out.print("\t");
		}
		// Saltamos la línea.
		System.out.println();
		/*
		 * Recorremos el bucle hastaque el valor de i supere al de tamCircuito, mientras va aumentando. 
		 */
		for (int i = 0; i <= tamCircuito; i++) {
			// Si el valor de fichaJ1 es igual al de i escribimos J1.
			if(fichaJ1==i) System.out.print("J1");
			// Sino escribimos un espaciado.
			else System.out.print("\t");
		}
		// Saltamos la línea.
		System.out.println();
		/*
		 * Recorremos el bucle hastaque el valor de i supere al de tamCircuito, mientras va aumentando. 
		 */
		for (int i = 0; i <= tamCircuito; i++) {
			// Si el valor de fichaJ2 es igual al de i escribimos J2.
			if(fichaJ2==i) System.out.print("J2");
			// Sino escribimos un espaciado.
			else System.out.print("\t");
		}
		// Saltamos la línea.
		System.out.println();
	}
	
	/**
	 * Esta función se encarga de decir si la suma de los números que se pasan por parámetros es par o impar.
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean sumaDeNumerosEsPrimo(int a, int b) {
		boolean primo = true; // Esta variable es la que nos dirá si el número introducido por el usuario es primo o no, y la inicializamos con valor true.
		int suma; // Esta variable es la suma de los números que se pasan por parámetro.
		// Asignamos a suma el valor de a más el de b.
		suma = a + b;
		/*
		 * Recorremos el bucle mientras que i sea menor a suma más uno entre dos a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 2.
		 */
		for (int i = 2; i < suma + 1 / 2; i++) {
			 // Si el resto de dividir suma entre i es igual a cero asignamos a la variable primo el valor false.
			 if (suma % i == 0) {
				 primo = false;
			 }			
		}
		// Devolvemos el valor de la variable primo.
		return primo;
	}
	
	/**
	 * Esta función dice que jugador va ganando o si van empatados.
	 * @param nomJ1
	 * @param nomJ2
	 */
	public void imprimeComoVaLacarrera(String nomJ1, String nomJ2) {
		// Si el valor de fichaJ1 y fichaJ2 es igual decimos que van empatados.
		if(fichaJ1==fichaJ2) System.out.println("Van empatados");
		// Si no ocurre lo anterior,
		else {
			// Si el valor de fichaJ1 es menor al de fichaJ2 decimos que va ganando el jugador 2.
			if(fichaJ1<fichaJ2) System.out.println("Va ganando " + nomJ2);
			// Sino decimos que va ganando el jugador 1.
			else System.out.println("Va ganando " + nomJ1);
		}
		// Saltamos la línea.
		System.out.println();
	}
	
	/**
	 * Esta función se encarga de decir quien ha ganado la carrera.
	 * @param nomJ1
	 * @param nomJ2
	 * @return
	 */
	public String esGanador(String nomJ1, String nomJ2) {
		String ganador = ""; // Esta es la variable donde guardaremos el nombre del ganador o los nombres de los ganadores.
		// Si los valores de fichaJ1 y fichaJ2 son iguales o mayores al tamaño del circuito asignamos a ganador un mensaje con ambos nombres.
		if(fichaJ1>=tamCircuito && fichaJ2>=tamCircuito) ganador = "Han ganado " + nomJ1 + " y " + nomJ2;
		// Sino pero si el valor de fichaJ1 es igual o mayor al tamaño del circuito asignamos a ganador un mensaje con el nombre del jugador 1.  
		else if(fichaJ1>=tamCircuito) ganador = "Ha ganado " + nomJ1;
		// Sino pero si el valor de fichaJ2 es igual o mayor al tamaño del circuito asignamos a ganador un mensaje con el nombre del jugador 2.
		else if(fichaJ2>=tamCircuito) ganador = "Ha ganado " + nomJ2;
		// Devolvemos el valor de ganador.
		return ganador;
	}
		
}
