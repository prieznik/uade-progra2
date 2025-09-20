package priorityQueue;

public interface PriorityQueue<K extends Comparable<K>,V> {
	public int size();
	public boolean isEmpty();
	public Entry<K,V> min();
	public void insert(K key, V value);
	public Entry<K,V> removeMin();
}

