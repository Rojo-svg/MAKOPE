                                                    // ADD
 public class FinallyDemo {                     // ADD

    static int test() {                        // your code, unchanged
        try {
            System.out.println("try");
            return 1;                          // value is saved, method is about to exit
        } finally {
            System.out.println("finally");     // still runs before the method exits
        }
    }

    public static void main(String[] args) {
        System.out.println(test());            // calls test(), then prints what it returned
    }
}                                              // ADD