import java.util.Scanner;                      // needed to read keyboard input

public class DivideDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // reads from the keyboard
        try {                                  // code that might fail
            System.out.print("Enter two integers: ");
            int a = Integer.parseInt(sc.nextLine()); // throws NumberFormatException if not a number
            int b = Integer.parseInt(sc.nextLine());
            System.out.println(a / b);         // throws ArithmeticException if b == 0
        } catch (NumberFormatException e) {    // runs for non-numeric input
            System.out.println("Enter whole numbers only.");
        } catch (ArithmeticException e) {      // runs for division by zero
            System.out.println("Cannot divide by zero.");
        } finally {
            sc.close();                        // always runs, releases the Scanner
        }
    }
}