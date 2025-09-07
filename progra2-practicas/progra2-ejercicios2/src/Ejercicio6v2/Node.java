package Ejercicio6v2;

public class Node<E> {
    private E element;
    private Node<E> next;
    //constructores
    public Node(E newElement, Node<E> n){
        element=newElement;
        next=n;
    }
    public Node(E newElement){
        element=newElement;
        next=null;
    }
    public Node(){
        element=null;
        next=null;
    }
    //metodos
    public E getElement(){
        return element;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setElement(E newElement){
        element=newElement;
    }
    public void setNext(Node<E> n){
        next=n;
    }
}
