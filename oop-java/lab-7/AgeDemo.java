class InvalidAgeException extends Exception {   // your lines 1-5, unchanged
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeDemo {                          // ADD this line

    static void validateAge(int age) throws InvalidAgeException {  // your lines 7-10, unchanged
        if (age < 0 || age > 120)
            throw new InvalidAgeException("Age must be 0-120, got " + age);
    }

    public static void main(String[] args) {    // ADD this block
        try {

            validateAge(25);                    // valid, nothing happens
            validateAge(150);                   // invalid, throws
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}                                               // ADD this closing brac


