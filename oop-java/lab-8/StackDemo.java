public class StackDemo {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);

        stack.push(2);
        stack.push(3);

        System.out.println("peek: " + stack.peek());        // 3
        System.out.println("pop: " + stack.pop());          // 3
        System.out.println("pop: " + stack.pop());          // 2
        System.out.println("isEmpty: " + stack.isEmpty());  // false
        System.out.println("pop: " + stack.pop());          // 1
        System.out.println("isEmpty: " + stack.isEmpty());  // true
    }
}
