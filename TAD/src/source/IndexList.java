package source;

public interface IndexList <E>{

    public int size();

    public boolean isEmpty();

    public void add (int r, E e) throws IndexOutOfBoundsException;

    public E get(int r) throws IndexOutOfBoundsException;

    public E remove(int r) throws IndexOutOfBoundsException;

}
