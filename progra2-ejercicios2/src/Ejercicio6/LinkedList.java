package Ejercicio6;

public class LinkedList <T>{
    private Node head;
    private int quantity;

    // initialize by default
    public LinkedList() {
        this.head = null;
        this.quantity = 0;
    }

    public void addValueEnd(T value){
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

    public void addValueStart(T value){
        Node<T> newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        quantity++;
    }


    // getters and setters
    public int getQuantity(){
        return quantity;
    }
    public  Node getHead(){
        return head;
    }
    public void setHead(Node head){
        this.head = head;
    }

    // to string un poco inventado
    @Override
    public String toString() {
        String res = "";
        Node<T> aux = this.head;
        while (aux != null){
            res+= aux.getData()+", ";
            aux=aux.getNext();
        } return res;
    }
}
