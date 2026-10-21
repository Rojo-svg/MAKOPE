import java.util.Arrays;

public class BubbleSortDemo {

    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {   // out of order?
                    T temp = arr[j];
                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;                          // already sorted
        }
    }

    public static void main(String[] args) {
        Integer[] ints = {64, 25, 12, 22, 11};
        String[] strs = {"Lynn", "Kuda", "Ada", "Tawanda"};

        bubbleSort(ints);
        bubbleSort(strs);

        System.out.println("Integer[]: " + Arrays.toString(ints));
        System.out.println("String[]: " + Arrays.toString(strs));


        // int[] raw = {3, 1, 2};
        // bubbleSort(raw);  // COMPILE ERROR: int is a primitive, not Comparable
    }
}
