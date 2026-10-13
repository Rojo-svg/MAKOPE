public class Person {
    String name;
    Address address;

    public static void main(String[] args) {
        Address a = new Address();
        a.street = " 343 Ganges road";
        a.city = "Belevedre Harare";

        Person p1 = new Person();
        p1.name = "Rojo";
        p1.address = a;
        System.out.println(p1.name + "Lives in" + p1.address.city);

        Person p2 = new Person();
        p2.name = "Trish";
        
        if (p2.address == null) {
            System.out.println(p2.name + "Has no address");
        }
        try {
            System.out.println(p2.address.city);
        } catch (NullPointerException e){
            System.out.println("NullPointerException caught");
        }
    }
}
