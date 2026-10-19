
public class ArrayDemo {

    static int getElement(int[] arr, int i) {
        try {
            return arr[i];                     // fails if i is out of range
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + i + " is out of range");
            return -1;                         // fallback value
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(getElement(nums, 1));  // prints 2
        System.out.println(getElement(nums, 5));  // prints the message, then -1

    }
}

