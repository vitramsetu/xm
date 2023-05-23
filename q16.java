import java.util.HashMap;
import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Read the input string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inputString = scanner.nextLine();
        scanner.close();

        // Split the string into words
        String[] words = inputString.split(" ");

        // Count the words
        for (String word : words) {
            // Check if the word already exists in the map
            if (wordCountMap.containsKey(word)) {
                // If it exists, increment the count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // If it doesn't exist, add it to the map with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word counts
        System.out.println(wordCountMap);
    }
}
