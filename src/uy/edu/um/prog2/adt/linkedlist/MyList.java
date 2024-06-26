package uy.edu.um.prog2.adt.linkedlist;

public interface MyList<T> {

    void add(T value);

    T get(int position);

    boolean contains(T value);

    void remove(T value);

    int size();

    Node<T> getFirst();

    boolean isEmpty();

    T removeLast();

    void addToTheEnd(T value);

    void addToBeginning(T value);

    String[] toArray();

    void setByIndex(int index, T value);

    void reverse();
}
