import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

    // private static nested class: a Node does not need the outer list object
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) { this.data = data; }
    }

    private Node<T> head;

    private Node<T> tail;
    private int size;

    public void add(T item) {
        Node<T> node = new Node<>(item);
        if (head == null) {
            head = tail = node;                       // first element
        } else {
            tail.next = node;                         // link after the last node
            tail = node;
        }
        size++;
    }

    public int size() { return size; }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();

    }

    // inner (non-static) class: it needs access to the outer list's head
    private class MyIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() { return current != null; }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T value = current.data;
            current = current.next;
            return value;
        }
    }

}
