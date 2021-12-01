package mx.edu.j2se.Gaona.tasks;

import static sun.misc.Version.println;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Task tarea1 = new Task("Correr",1600);
		Task tarea2 = new Task("Leer",700,800,1);
		System.out.println(tarea1.title);
		System.out.println(tarea2.title);
		Task tarea3 = new Task("Brincar", 1600);
		Task tarea4 = new Task("Jugar",1800);
		ArrayList<Task> lista = new ArrayList<Task>();
		lista.add(tarea1);
		lista.add(tarea2);
		/*lista.add(tarea2);*/
		lista.size();
		lista.remove(tarea2);
		System.out.println(lista.size());
		System.out.println(tarea3.title);
		System.out.println(lista.size());
		//System.out.println(lista.getTask(0));


		for(Object Task: lista){
			System.out.println(Task);
		}
		/*System.out.println(tarea2.title);*/

	}

	
}
