package Stack;
import List.MyException;

public class ArrayStack<E> implements Stack<E> {
	private E[] array;
    private int size;
    public ArrayStack() {
        array = (E[]) new Object[10];
        size = 0;
    }
    public ArrayStack(int initialSize) {
        array = (E[]) new Object[initialSize];
        size = 0;
    }

    public void push(E element) {
    	//Podría generar una excepción si se alcanza la capacidad máxima del arreglo
        if (size == array.length) {
            resizeArray();
        }
        array[size] = element;
        size++;
    }
    private void resizeArray() {
        E[] newArray = (E[]) new Object[2 * array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public E pop() {
        if (size == 0)
            throw new MyException("La pila está vacía, no puedo desapilar un elemento");
        E top = array[size - 1];
        array[size - 1] = null;
        size--;
        return top;
    }

    public E top() {
        if (size == 0)
            throw new MyException("No se puede ver el primer elemento porque la pila está vacía");
        E top = array[size - 1];
        return top;
    }
    
    public boolean isEmpty() {
    	return size==0;
    }

    public int size() {
        return size;
    }
}
