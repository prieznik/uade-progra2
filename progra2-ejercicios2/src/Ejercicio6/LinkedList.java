package Ejercicio6;

public class LinkedList <T>{
    private Node head;
    private int quantity;

    // initialize by default
    public LinkedList() {
        this.head = null;
        this.quantity = 0;
    }

    // add node - nodes are added at the end by default as is not relevant for this exercise
    public void addValue(T value){
        Node<T> newNode = new Node(value); // creating new node with value T so we can create different instances with different values
        if (head == null){
            head = newNode;
        } else {
            Node aux = this.head;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        quantity++; // at end since there is no case where node cannot be added
    }

    // getters and setters
    public int getQuantity(){
        return quantity;
    }
    public  Node getHead(){
        return head;
    }
}
