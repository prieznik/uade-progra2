package queue;


public class LinkedQueue<E> implements Queue<E> {
	protected Node<E> head;
	protected Node<E> tail;
	protected int size;
	//constructor
	public LinkedQueue(){
		head=null; tail=null; size=0;
	}
	//metodos
	public int size(){return size;}
	public boolean isEmpty(){return size==0;}
	public E front() throws MyException{
		if(isEmpty())throw new MyException("Esta vacia");
		return head.getElement();
	}
	public void enqueue(E elem){
		Node<E> aux=new Node<E>(elem,null);
		if(size==0)head=aux;
		else tail.setNext(aux);
		tail=aux;
		size++;
	}
	public E dequeue()throws MyException{
		if(size==0)throw new MyException("Esta vacia");
		E aux=head.getElement();
		Node<E>aux2=head;
		head=aux2.getNext();
		aux2.setNext(null);
		size--;
		if(size==0)tail=null;
		return aux;
	}
}

