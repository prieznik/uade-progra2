package List;
import General.Persona;

public class Node {
	private Persona element;
	private Node next;
	//constructores
	public Node(Persona p, Node n){
		element=p; 
		next=n;
	}
	public Node(Persona p){
		element=p; 
		next=null;
	}
	public Node(){
		element=null; 
		next=null;
	}
	//metodos
	public Persona getElement(){
		return element;
	}
	public Node getNext(){
		return next;
	}
	public void setElement(Persona p){
		element=p;
	}
	public void setNext(Node n){
		next=n;
	}
	public String toString(){
		return element.getNombre();
	}
}

