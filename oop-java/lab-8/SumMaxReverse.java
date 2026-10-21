import java.util.*;

public class SumMaxReverse {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(14, 7, 23, 5, 42, 18, 9, 31, 2, 27));

        int sum = 0;
        for (int n : nums) sum += n;                 // add every number

        int max = Collections.max(nums);             // largest value

        ArrayList<Integer> reversed = new ArrayList<>(nums);
        Collections.reverse(reversed);               // reverse a copy

        System.out.println("List: " + nums);
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Reversed: " + reversed);
    }
}