package queue;

public class ArrayQueue<E> implements Queue<E> {
	private int f;
	private int r;
	private int size;
	private E[] q;
	
	public ArrayQueue() {
		f=0;
		r=0;
		size=0;
		q = (E[]) new Object[100];
	}
	
	public void enqueue(E elemento) throws MyException {
		/*
		Si size() == N-1 entonces 
			error( “cola llena”) 
		Sino 
			q[r] = e;
			r = (r+1) mod N

		 */
		if(size==q.length-1) {
			throw new MyException("Cola llena"); 
		}
		else
		{
			q[r] = elemento;
			size++;
			r = (r+1) % q.length;
		}
	}
	
	public E dequeue() {
		/*
		Si isEmpty() entonces error( “cola vacía”)
 		Sino
 			temp = q[f];          
			q[f] = null; 
			f = (f+1) mod N;   
			retornar temp

		 */
		if(size==0)
			throw new MyException("Cola vacía");
		else
		{
			E temp = q[f];          
			q[f] = null; 
			f = (f+1) % q.length;
			size--;
			return temp;
		}
		
		
	}
	public E front() {
		if(size==0)
			throw new MyException("Cola vacía");
		else
			return q[f];
	}
	
	public boolean isEmpty() {return size==0;}
	 
	public int size() {return size;}
}
