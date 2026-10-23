import java.util.*;
import java.util.function.Predicate;
public class Ex2_RemoveEvens {
 public static void main(String[] args) {
 List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
 System.out.println("Before: " + numbers);
 Predicate<Integer> isEven = n -> n % 2 == 0;
 numbers.removeIf(isEven);
 System.out.println("After: " + numbers);
 }
}
