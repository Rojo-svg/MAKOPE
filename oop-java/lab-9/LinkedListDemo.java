public class LinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Kuda");
        list.add("Ada");
        list.add("Lynn");

        for (String name : list) {                    // works because of Iterable
            System.out.println(name);
        }
        System.out.println("Size: " + list.size());
    }
}