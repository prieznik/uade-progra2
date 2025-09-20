package Map;

public class ArrayMap<K,V> implements Map<K,V> {
	
	private Entry<K,V>[] array;
	private int size;
	
	public ArrayMap() {
		array = (Entry<K,V>[])new Entrada[100];
		size = 0;
	}
	
	public V remove(K k) {
		int i=0;
		boolean encontreClave=false;
		while(!encontreClave && i<size) {
			if(array[i].getKey()==k)
				encontreClave=true;
			else
				i++;
		}
		if(!encontreClave)
			return null;
		else {
			V auxiliar = array[i].getValue();
			array[i] = array[size-1];
			size--;
			return auxiliar;
		}
	}
	
	public V get(K k) {
		int i=0;
		boolean encontreClave=false;
		while(!encontreClave && i<size) {
			if(array[i].getKey()==k)
				encontreClave=true;
			else
				i++;
		}
		if(!encontreClave)
			return null;
		else {
			return array[i].getValue();
		}
	}
	
	public V put(K k, V v) {
		int i=0;
		boolean encontreClave=false;
		while(!encontreClave && i<size) {
			if(array[i].getKey()==k)
				encontreClave=true;
			else
				i++;
		}
		if(!encontreClave) {
			if(size<array.length) {
				array[size] = new Entrada(k,v);
				size++;
				return null;
			}
			else
				throw new MyException("El arreglo está lleno");
		}
		else {
			V auxiliar = array[i].getValue();
			array[i].setValue(v);
			return auxiliar;
		}
	}
	
	public int size() {return size;}
	public boolean isEmpty(){return size==0;}
	
	public Entry<K,V>[] entries(){
		Entry<K,V>[] auxArray = (Entry<K,V>[])new Entrada[size];
		for(int i=0;i<size;i++)
			auxArray[i]=new Entrada(array[i].getKey(),array[i].getValue());
		return auxArray;
	}
	
	
		
	public K[] keys() {
		//me creo un arreglo auxiliar
		K[] aux = (K[])new Object[size];
		//recorro array pidiendo las claves
		for(int i=0;i<size;i++)
		//las agrego a auxiliar
			aux[i]=array[i].getKey();
		//devuelvo auxiliar
		return aux;
	}
	
	public V[] values() {
		//me creo un arreglo auxiliar
		V[] aux = (V[])new Object[size];
		//recorro array pidiendo las claves
		for(int i=0;i<size;i++)
		//las agrego a auxiliar
			aux[i]=array[i].getValue();
		//devuelvo auxiliar
		return aux;
	}
	
}
