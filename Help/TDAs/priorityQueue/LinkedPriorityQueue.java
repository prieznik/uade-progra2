package priorityQueue;

import queue.MyException;
import queue.Node;
//Implementación dinámica - Estructura de nodos enlazada
//Opción con insert Ordenado (min y remove min encuentran la máxima prioridad en el primer elemento)
//Las prioridades más pequeñas se consideran más "urgentes"
public class LinkedPriorityQueue<K extends Comparable<K>,V> implements PriorityQueue<K,V> {
	protected Node<Entrada<K,V>> head;
	protected Node<Entrada<K,V>> tail;
	protected int size;
	//constructor
	public LinkedPriorityQueue(){
		head=null; tail=null; size=0;
	}
	//metodos
	public int size(){return size;}
	public boolean isEmpty(){return size==0;}
	//Al estar ordenado, la cabeza apunta al primer elemento que debe salir
	public Entry<K,V> min() throws MyException{
		if(isEmpty())
			throw new MyException("Esta vacia");
		else
			return head.getElement();
	}
	//Idem pero quitando el nodo
	public Entry<K,V> removeMin()throws MyException{
		if(size==0)
			throw new MyException("Esta vacia");
		else
		{
			Entrada<K,V> salida = head.getElement();
			head=head.getNext();
			size--;
			return salida;
		}
	}
	
	public void insert(K key, V value){
		Entrada<K,V> elementoNodo = new Entrada<K,V>(key,value);
		Node<Entrada<K,V>> nuevoNodo=new Node<Entrada<K,V>>(elementoNodo ,null);
		//Como es ordenado, tengo que buscar de menor a mayor
		if(size==0 || head.getElement().getKey().compareTo(key)>0)
		{
			//tengo que insertar antes de la cabeza
			nuevoNodo.setNext(head);
			head = nuevoNodo;
		}
		else
		{
			//tengo que recorrer
			Node<Entrada<K,V>> actual = head;
			//mientras el próximo no sea nulo y la prioridad del próximo sea menor a lo que quiero insertar, avanzo!
			while(actual.getNext()!=null && actual.getNext().getElement().getKey().compareTo(key)<1) {
				actual = actual.getNext();
			}
			//En este punto actual apunta al nodo "anterior" a donde va el nuevo
			nuevoNodo.setNext(actual.getNext());
			actual.setNext(nuevoNodo);
			
		}
		size++;
	}
	

}
