class Parent {
    String type = "Parent field";
    void show() { System.out.println("Parent method"); }
}
class Child extends Parent {
    String type = "Child field";
    @Override
    void show() { System.out.println("Child method"); }
}

public class FieldVsMethod {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        System.out.println(p.type);
    }
}
