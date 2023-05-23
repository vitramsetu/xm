import java.util.Arrays;
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 10 strings from console
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();
        String combinedString = firstString + secondString;
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string
        StringBuilder reversedString = new StringBuilder(firstString);
        reversedString.reverse();
        System.out.println("Reversed first string: " + reversedString);

        scanner.close();
    }
}

