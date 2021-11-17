package mx.edu.j2se.Gaona.tasks;

import static sun.misc.Version.println;

public class Main {
	
	public static void main(String[] args) {
		Task tarea1 = new Task("Correr",1600);
		Task tarea2 = new Task("Leer",700,800,1);
		System.out.println(tarea1.title);
		System.out.println(tarea2.title);


	}

	
}
