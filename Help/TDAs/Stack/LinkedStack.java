package Stack;
import List.Node;
import List.MyException;

public class LinkedStack<E> implements Stack<E>{
	private Node<E> top;
    private int size;
    public LinkedStack() {
        top = null;
        size = 0;
    }
    
    public void push(E element) {
    	Node<E> newNode = new Node<E>(element, top);
        top = newNode;
        size++;
    }

    public E pop(){
        if (size == 0)
            throw new MyException("La pila está vacía, no puedo desapilar un elemento");
        Node<E> oldTop = top;
        top = oldTop.getNext();
        oldTop.setNext(null);
        size--;
        return oldTop.getElement();
    }

    public E top() {
        if (size == 0)
            throw new MyException("No se puede ver el primer elemento porque la pila está vacía");
        return top.getElement();
    }
    
    public boolean isEmpty() {
    	return size==0;
    }

    public int size() {
        return size;
    }
}
