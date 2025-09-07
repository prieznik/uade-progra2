package general;
import priorityQueue.*;

public class principal {

	public static void main(String[] args) {
		//test de priority queue
		LinkedPriorityQueue<Integer, String> ColaConPrioridad = new LinkedPriorityQueue<Integer, String>();
		ColaConPrioridad.insert(2, "mundo");
		ColaConPrioridad.insert(1, "Hola");
		ColaConPrioridad.insert(3, "Java");
		
		while(ColaConPrioridad.size()!=0) {
			Entry<Integer,String> salida = ColaConPrioridad.removeMin();
			System.out.println(salida.getKey()+" - "+salida.getValue());
		}
		

	}

}
