
package Stack;
import List.MyException;

public interface Stack<E> {
	public void push(E item);
	//Quita y muestra el elemento en el tope de la pila. Si la pila está vacía, devuelve null.
	public E pop();
	public E top();
	public boolean isEmpty();
	public int size();
}
