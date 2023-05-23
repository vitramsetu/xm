/* import java.util.HashMap;

public class q2 {
    public static void main(String[] args) {
        String str = "Java is a programming language. Java is widely used in industry. Java is versatile.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.toLowerCase().split(" ");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If the word already exists in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with count 1
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Duplicate words in the string:");

        for (String word : wordCountMap.keySet()) {
            if (wordCountMap.get(word) > 1) {
                System.out.println(word + ": " + wordCountMap.get(word));
            }
        }
    }
}
*/


public class q2 {
    public static void main(String[] args) {
        String str = "umbrella";

        if (str.contains("e")) {
            System.out.println("The string contains 'e'.");
        } else {
            System.out.println("The string does not contain 'e'.");
        }
    }
}

