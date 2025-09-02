package Main;
import General.Persona;
import List.LinkedList;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList miLista = new LinkedList();
		//Agrego 3 personas a la lista 
		//soy usuario, no sé que es un nodo, no tengo acceso a la estructura interna
		//opero con los métodos que me brinda la lista como addFirst
		Persona p1 = new Persona("Ale");
		Persona p2 = new Persona("Juan");
		Persona p3 = new Persona("Jose");
		miLista.addFirst(p1);
		miLista.addFirst(p2);
		miLista.addLast(p3);
		//Ejemplo de un recorrido sobre la lista
		miLista.First();
		int recorridos=0;
		while(!miLista.atEnd()) {
			System.out.println("Elemento "+recorridos+++" valor: "+miLista.getCurrent().toString());
			miLista.advance();
		}
	}

}
