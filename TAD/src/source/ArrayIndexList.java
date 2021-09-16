package source;

public class ArrayIndexList <E> implements IndexList <E>{



    private E[] A;
    private int capacity = 16;
    private int size = 0;


    @SuppressWarnings("unchecked")

    public ArrayIndexList() {
        A = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }



    public void add(int r, Object e) throws IndexOutOfBoundsException {

        checkIndex(r, size() + 1);

        //E[] A = new (E) A [size];

        if (size == capacity) {

            capacity *= 2;

            @SuppressWarnings("unchecked")

            E[] B = (E[]) new Object[capacity];

            for (int i = 0; i < size; i++) B[i] = A[i];

            A = B;

        }

        for (int i = size - 1; i >= r; i--) {
            A[i + 1] = A[i];
        }


        A[r] = (E) e;
        size++;

    }


    public E get(int r) throws IndexOutOfBoundsException {
        checkIndex(r, size());
        return A[r];
    }


    public E remove(int r) throws IndexOutOfBoundsException {
        checkIndex(r, size());
        E temp = A[r];

        for (int i = r; i < size - 1; i++) {
            A[i] = A[i + 1];
        }


        size--;

        return temp;
    }

    protected void checkIndex(int r, int n) throws IndexOutOfBoundsException {

        if (r < 0 || r >= n) throw new IndexOutOfBoundsException("Illegal index: " + r);

    }

    public String toString() {

        String toReturn = "(";

        if (size() == 0) return "()";

        for (int i = 0; i < size(); i++) toReturn += A[i].toString() + ", ";

        return toReturn.substring(0, toReturn.length() - 2) + ")";

    }

    public E set(int r, E e) throws IndexOutOfBoundsException {

        checkIndex(r, size());

        E temp = A[r];

        A[r] = e;

        return temp;

    }
}
