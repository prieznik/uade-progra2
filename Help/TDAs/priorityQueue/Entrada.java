package priorityQueue;

public class Entrada<K extends Comparable<K>,V> implements Entry<K,V> {
	 private K clave;
	 private V valor;
	 public Entrada(K k, V v) { clave = k; valor = v; }
	 public K getKey() { return clave; }
	 public V getValue() { return valor; }
	 public void setKey( K k ) { clave = k; }
	 public void setValue(V v) { valor = v; }
	 public String toString( ) {
		 return "(" + getKey() + "," + getValue() + ")" ;
	 }
}