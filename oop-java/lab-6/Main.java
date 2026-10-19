interface A {
    default void hello() { System.out.println("Hello from A"); }
}
interface B {
    default void hello() { System.out.println("Hello from B"); }

}

class C implements A, B {                      // inherits two hello() defaults: compile error unless resolved
    @Override
    public void hello() {                      // must override
        A.super.hello();                       // explicitly call A's version
        B.super.hello();                       // and/or B's version
    }
}

public class Main {
    public static void main(String[] args) {
        new C().hello();                       // Hello from A, then Hello from B
    }
}
