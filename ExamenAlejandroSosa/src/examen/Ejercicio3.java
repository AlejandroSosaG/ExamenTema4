package examen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String nombreAlumno; // Esta variable es el nombre de los alumnos que introducirá el usuario.
		int notaPractica; // Esta variable de la nota de la parte práctica que introducirá el usuario.
		int notaProblemas; // Esta variable de la nota de la parte de problemas que introducirá el usuario.
		int notaTeorica; // Esta variable de la nota de la parte teórica que introducirá el usuario.
		double notaFinal = 0; // Esta es la variable donde se calculará la nota final de cada alumno.
		int notaMax; // Esta es la variable donde se guardará el valor de la mayor nota introducida.
		int notaMin; // Esta es la variable donde se guardará el valor de la menor nota introducida.
		double media=0; // Esta es la variable donde calcularemos la media de todas las notas introducidas por el usuario.
		int opc; // Esta variable es la opción que el usuario deberá introducir una vez termine de introducir alumnos.
		int cont = 0; // Esta variable es la cantidad de notas que ha introducido el usuario y nos ayudará a calcular la media.
		String nombreMax; // Esta es la variable es donde introduciremos el nombre del alumno con mayor nota.
		String nombreMin; // Esta es la variable es donde introduciremos el nombre del alumno con menor nota.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el nombre del primer alumno.
		System.out.println("Introduzca el nombre de un alumno");
		// Asignamos a nombreAlumno el nombre que ha escrito el usuario.
		nombreAlumno = sc.nextLine();
		// Asignamos a nombreMax el valor de nombreAlumno.
		nombreMax=nombreAlumno;
		// Asignamos a nombreMin el valor de nombreAlumno.
		nombreMin = nombreAlumno;
		// Pedimos al usuario el valor de la nota práctica.
		System.out.println("Introduzca la nota de la parte práctica");
		// Asignamos a notaPractica el valor introducido.
		notaPractica = sc.nextInt();
		// Aumentamos el valor de la variable cont.
		cont++;
		// Asignamos a notaMax el valor de notaPractica.
		notaMax = notaPractica;
		// Asignamos a notaMin el valor de notaPractica.
		notaMin = notaPractica;
		// Asignamos a la variable media su valor más el de notaPractica.
		media+=notaPractica;
		// Pedimos al usuario el valor de la nota de problemas.
		System.out.println("Introduzca la nota de la parte de problemas");
		// Asignamos a notaProblemas el valor introducido.
		notaProblemas= sc.nextInt();
		// Aumentamos el valor de la variable cont.
		cont++;
		// Asignamos a la variable media su valor más el de notaProblemas.
		media +=notaProblemas;
		// Si el valor de notaProblemas es menor al de notaMin asignamos a notaMin su valor.
		if(notaProblemas<notaMin) notaMin=notaProblemas;
		// Sino ocurre lo anterior pero si notaProblemas es mayor a notaMax asignamos a notaMax el valor de notaProblemas.
		else if(notaProblemas>notaMax) notaMax = notaProblemas;
		// Peidmos al usuario el valor de la nota teórica.
		System.out.println("Introduzca la nota de la parte teórica");
		// Asignamos a notaTeorica el valor introducido.
		notaTeorica= sc.nextInt();
		// Asignamos a notaMax el valor de notaPractica.
		cont++;
		// Asignamos a la variable media su valor más el de notaProblemas.
		media += notaTeorica;
		// Si el valor de notaProblemas es menor al de notaMin asignamos a notaMin su valor.
		if(notaTeorica<notaMin) notaMin=notaTeorica;
		// Sino ocurre lo anterior pero si notaProblemas es mayor a notaMax asignamos a notaMax el valor de notaTeorica.
		else if(notaTeorica>notaMax) notaMax = notaTeorica;
		/*
		 * Recorremos el bucle mientras que el valor de nombreAlumno no sea nulo y el de notaPractica, notaProblemas y notaTeorica estén entre 0 y 10.
		 */
		while(nombreAlumno.isEmpty()==false && notaPractica<11 && notaPractica>=0 && notaProblemas<11 && notaProblemas>=0 && notaTeorica<11 && notaTeorica>=0) {
			// Asignamos a notaFinal su valor más el de notaPractica por 0,10.
			notaFinal += notaPractica*0.10;
			// Asignamos a notaFinal su valor más el de notaProblemas por 0,50.
			notaFinal += notaProblemas*0.50;
			// Asignamos a notaFinal su valor más el de notaTeoica por 0,40.
			notaFinal += notaTeorica*0.40;
			// Mostramos por pantalla un mensaje con la nota final del alumno.
			System.out.println("La nota final del alumno " + nombreAlumno + " es " + notaFinal);
			// Reseteamos el valor de nota final a 0.
			notaFinal=0;
			// Pedimos al usuario el nombre del siguiente alumno.
			System.out.println("Introduzca el nombre del siguiente alumno");
			// Asignamos a nombreAlumno el nombre que ha escrito el usuario.
			nombreAlumno = sc.next();
			// Pedimos al usuario el valor de notaPractica del siguiente alumno.
			System.out.println("Introduzca la nota de la parte práctica");
			// Asignamos a notaPractica el nuevo valor introducido.
			notaPractica = sc.nextInt();
			// Si el valor de notaPractica no está entre 0 y 10 salimos del bucle.
			if(notaPractica>10 || notaPractica<0) break;
			// Incrementamos el valor de cont.
			cont++;
			// Asignamos a la variable media su valor más el de notaPractica.
			media += notaPractica;
			// Si el valor de notaPractica es menor al de notaMin asignamos a notaMin su valor y asignamos a nombreMin el de nombreAlumno.
			if(notaPractica<notaMin) {
				notaMin=notaPractica;
				nombreMin = nombreAlumno;
			// Sino ocurre lo anterior pero si notaPractica es mayor a notaMax asignamos a notaMax el valor de notaProblemas y a nombreMax el de nombreAlumno.
			}else if(notaPractica>notaMax) {
				notaMax = notaPractica;
				nombreMax = nombreAlumno;
			}
			System.out.println("Introduzca la nota de la parte de problemas");
			// Asignamos a notaProblemas el nuevo valor introducido.
			notaProblemas = sc.nextInt();
			// Si el valor de notaProblemas no está entre 0 y 10 salimos del bucle.
			if(notaProblemas>10 || notaProblemas<0) break;
			// Incrementamos el valor de cont.
			cont++;
			// Asignamos a la variable media su valor más el de notaProblemas.
			media += notaProblemas;
			// Si el valor de notaProblemas es menor al de notaMin asignamos a notaMin su valor y asignamos a nombreMin el de nombreAlumno.
			if(notaProblemas<notaMin) {
				notaMin=notaProblemas;
				nombreMin = nombreAlumno;
			// Sino ocurre lo anterior pero si notaProblemas es mayor a notaMax asignamos a notaMax el valor de notaProblemas y a nombreMax el de nombreAlumno.
			}else if(notaProblemas>notaMax) {
				notaMax = notaProblemas;
				nombreMax = nombreAlumno;
			}
			System.out.println("Introduzca la nota de la parte teórica");
			// Asignamos a notaTeorica el nuevo valor introducido.
			notaTeorica = sc.nextInt();
			// Si el valor de notaTeorica no está entre 0 y 10 salimos del bucle.
			if(notaTeorica>10 || notaTeorica<0) break;
			// Incrementamos el valor de cont.
			cont++;
			// Asignamos a la variable media su valor más el de notaTeorica.
			media += notaTeorica;
			// Si el valor de notaTeorica es menor al de notaMin asignamos a notaMin su valor y asignamos a nombreMin el de nombreAlumno.
			if(notaTeorica<notaMin) {
				notaMin=notaTeorica;
				nombreMin = nombreAlumno;
			// Sino ocurre lo anterior pero si notaTeorica es mayor a notaMax asignamos a notaMax el valor de notaProblemas y a nombreMax el de nombreAlumno.
			}else if(notaTeorica>notaMax) {
				notaMax = notaTeorica;
				nombreMax = nombreAlumno;
			}
		}
		// Asignamos a la variable media su valor entre el de cont.
		media /= cont;
		// Mostramos por pantalla un menú para que el usuario eliga lo que quiera.
		System.out.println("A continuación, eliga una de las tres opciones:"
				+ "1. Nota máxima"
				+ "2. Nota mínima"
				+ "3. Media de las notas");
		// Asignamos a opc el valor elegido por el usuario.
		opc = sc.nextInt();
		/*
		 * Dependiendo del valor de opc se ejecutará un caso distinto.
		 */
		switch(opc) {
		// Si su valor es uno mostraremos por pantalla un mensaje con la mayor nota introducida y el nombre del alumno.
		case 1:
			System.out.println("El nombre del alumno con la mayor nota es " + nombreMax + " y su nota es " + notaMax);
			break;
		// Si su valor es dos mostraremos por pantalla un mensaje con la menor nota introducida y el nombre del alumno.
		case 2:
			System.out.println("El nombre del alumno con la menor nota es " + nombreMin + " y su nota es " + notaMin);
			break;
		// Si su valor es tres mostraremos por pantalla un mensaje con la media de todas las notas introducidas.
		case 3:
			System.out.println("La media de todas las notas introducidas es " + media);
		}
		// Cerramos el escaner.
		sc.close();
	}

}
