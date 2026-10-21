import java.util.ArrayList;

public class MyStack<T> {
    private final ArrayList<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);                              // add to the top (end of list)
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");

        return items.remove(items.size() - 1);        // remove and return the top
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return items.get(items.size() - 1);           // look at the top only
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
