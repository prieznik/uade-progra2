package Ejercicio7;

public class Node<E>{
    private E element;
    private Ejercicio6v2.Node<E> next;
    //constructores
    public Node(E newElement, Ejercicio6v2.Node<E> n){
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
    public Ejercicio6v2.Node<E> getNext(){
        return next;
    }
    public void setElement(E newElement){
        element=newElement;
    }
    public void setNext(Ejercicio6v2.Node<E> n){
        next=n;
    }
}
