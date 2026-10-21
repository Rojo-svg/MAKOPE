import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kuda", "Ada", "Lynn", "Ada", "Tawanda", "Kuda");

        // A Set cannot hold duplicates; LinkedHashSet keeps the original order
        Set<String> unique = new LinkedHashSet<>(names);

        System.out.println("Original: " + names);
        System.out.println("No duplicates: " + unique);
    }
}
