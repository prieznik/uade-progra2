package List;

public interface List<E>{
	public void addFirst(E newElement);
	public void addLast(E newElement);
	public void removeFirst()throws MyException;
	public void removeLast()throws MyException;
	public void remove(E element)throws MyException;
	public void First();
	public void advance();
	public E getCurrent();
	public boolean atEnd();
	public int getSize();
}