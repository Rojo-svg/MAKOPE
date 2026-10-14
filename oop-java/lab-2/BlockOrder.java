public class BlockOrder {
    static { System.out.println("static block 1"); }      // runs once, at class load
    { System.out.println("instance block 1"); }           // runs for every object
    static { System.out.println("static block 2"); }
    { System.out.println("instance block 2"); }

    BlockOrder() { System.out.println("constructor"); }   // runs after the instance blocks

    public static void main(String[] args) {
        System.out.println("--- main starts ---");
        new BlockOrder();
        new BlockOrder();

    }
    
}
