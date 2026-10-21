import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        Map<String, Integer> freq = new HashMap<>();
        for (String word : paragraph.toLowerCase().split("\\W+")) {
            if (word.isEmpty()) continue;
            freq.merge(word, 1, Integer::sum);        // add 1 to this word's count
        }

        // Sort by frequency, highest first
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
