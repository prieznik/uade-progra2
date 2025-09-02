package List;
import General.Persona;
import General.MyException;

public class LinkedList {
	protected Node head;
	protected int size;
	protected Node current;
	//constructor
	public LinkedList(){
		head=null; 
		size=0;
	}
	private void addFirst(Node n){
		n.setNext(head);
		head=n;
		size++;
	}
	public void addFirst(Persona p){
		Node aux=new Node(p);
		addFirst(aux);
	}
	public void addFirst(String s){
		Persona per=new Persona(s);
		addFirst(per);
	}
	
	private void addLast(Node n){
		if(head==null)
			head=n;
		else{
			Node i=head;
			while(i.getNext()!=null)
				i=i.getNext();
			i.setNext(n);
			
		}
		size++;
	}
	
	public void addLast(Persona p){
		Node aux=new Node(p);
		addLast(aux);
	}
	
	public void addLast(String s){
		Persona per=new Persona(s);
		addLast(per);
	}
	
	public void removeFirst()throws MyException{
		if(head==null)
			throw new MyException("La lista está vacia, no se puede eliminar primero");
		Node aux=head.getNext();
		head.setNext(null);
		head=aux;
		size--;
	}
	
	public void removeLast()throws MyException{
		if(head==null)
			throw new MyException("La lista está vacia, no se puede eliminar ultimo");
		if(size==1)
			head=null;
		else{
			Node aux=head;
			Node aux2=aux.getNext();
			while(aux2.getNext()!=null){aux=aux2;aux2=aux2.getNext();}
			aux.setNext(null);
		}
		size--;
	}
	//Este remove elimina un nodo, el usuario no puede pasarnos un nodo,
	//TAREA: Implementar este método para eliminar una persona que se recibe como parámetro. 
	//OBS: Cuidado con las referencias!
	public void remove(Node n)throws MyException{
		if(head==null)
			throw new MyException("La lista está vacia, no se puede eliminar");
		if(n==head)
			removeFirst();
		Node aux=head;
		while(aux!=null && aux.getNext()!=n) 
			aux=aux.getNext();
		if(aux==null)
			throw new MyException("El nodo no pertenece a la lista, no se puede eliminar");
		aux.setNext(n.getNext());
		n.setNext(null);
		size--;
	}
	
	public void First(){current=head;}
	
	public void advance()throws MyException{
		if(current==null)
			throw new MyException("Fuera de lista");
		else
			current=current.getNext();
	}
	
	public Node getCurrent()throws MyException{
		if(current==null)
			throw new MyException("No se puede devolver el nodo actual porque es nulo");
		return current;
	}
	
	public boolean atEnd(){return current==null;}
	
	public String toString(){
		String salida=new String("");
		if(size!=0){
			Node i=head;
			while(i!=null){
				salida+=" "+i.getElement().getNombre()+" "; i=i.getNext();
			}
		}
		return salida;
	}
}
