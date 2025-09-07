package priorityQueue;

public class Node <E>{
	private E dato;
	private Node<E> next;
	//constructor
	public Node(E d, Node<E> n){
		dato=d; next=n;}
	//metodos
	public E getElement(){return dato;}
	public Node<E> getNext(){return next;}
	public void setElement(E d){dato=d;}
	public void setNext(Node<E> n){next=n;}
}
