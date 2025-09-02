package General;
import List.*;
import Stack.LinkedStack;
import Stack.ArrayStack;

public class Principal {

	public static void main(String[] args) {
		LinkedList<Integer> miLista;
		miLista=new LinkedList<Integer>();
		LinkedList<Double> miLista2;
		miLista2=new LinkedList<Double>();
		try {
			miLista.removeFirst();
		}
		catch(Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.print("Ingrese una cadena para invertir: ");
		String cadena = System.console().readLine();
		char[] caracteres = cadena.toCharArray();
		LinkedStack<Character> pila = new LinkedStack<Character>();
		for(int i = 0; i<caracteres.length;i++)
			try {
				pila.push(caracteres[i]);
			}
			catch(MyException E) {
				
			}
		System.out.print("La salida es: ");
		while(!pila.isEmpty())
			System.out.print(pila.pop());
	}

}
