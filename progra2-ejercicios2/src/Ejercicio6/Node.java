package Ejercicio6;

public class Node <T>{
    private T data;
    private Node next;

    // constructor
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(T data) {
        this.data = data;
    }

    // getters and setters to use in linkedlist
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
