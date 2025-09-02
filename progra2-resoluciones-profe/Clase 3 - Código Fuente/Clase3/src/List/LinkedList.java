package List;

public class LinkedList<E> implements List<E> {
	private Node<E> head;
	private int size;
	private Node<E> current;
	//constructor
	public LinkedList(){
		head=null; 
		size=0;
	}
	public void addFirst(E newElement){
		Node<E> n=new Node<E>(newElement);
		n.setNext(head);
		head=n;
		size++;
	}
	
	public void addLast(E newElement){
		Node<E> n=new Node<E>(newElement);
		if(head==null)
			head=n;
		else{
			Node<E> i=head;
			while(i.getNext()!=null)
				i=i.getNext();
			i.setNext(n);
		}
		size++;
	}

	public void removeFirst()throws MyException{
		if(head==null)
			throw new MyException("La lista está vacia, no se puede eliminar primero");
		Node<E> aux=head.getNext();
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
			Node<E> aux=head;
			Node<E> aux2=aux.getNext();
			while(aux2.getNext()!=null){aux=aux2;aux2=aux2.getNext();}
			aux.setNext(null);
		}
		size--;
	}
	
	public void remove(E element)throws MyException{
		if(head==null)
			throw new MyException("La lista está vacia, no se puede eliminar");
		if(element.equals(head.getElement()))
			removeFirst();
		Node<E> aux=head;
		while(aux!=null && !aux.getNext().getElement().equals(element)) 
			aux=aux.getNext();
		if(aux==null)
			throw new MyException("El elemento no pertenece a la lista, no se puede eliminar");
		Node<E> aEliminar = aux.getNext();
		aux.setNext(aEliminar.getNext());
		aEliminar.setNext(null);
		size--;
	}
	
	public void removeAll(E element)throws MyException{
		if(head==null)
			throw new MyException("La lista está vacia, no se puede eliminar");
		Node<E> aux=head;
		while(aux!=null) 
		{
			if(aux.getElement().equals(element))
				remove(element);
			aux=aux.getNext();
		}
		
	}
	
	public void First(){current=head;}
	
	public void advance()throws MyException{
		if(current==null)
			throw new MyException("Fuera de lista");
		else
			current=current.getNext();
	}
	
	public E getCurrent()throws MyException{
		if(current==null)
			throw new MyException("No se puede devolver el nodo actual porque es nulo");
		return current.getElement();
	}
	
	public boolean atEnd(){return current==null;}
	
	public int getSize() {
		return size;
	}
	
}
