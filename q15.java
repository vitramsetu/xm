import java.util.ArrayList;
import java.util.Iterator;

public class q15 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Insert elements into the ArrayList
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Iterator Loop:");
        // Iterate using iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nAdvanced For Loop:");
        // Iterate using advanced for-loop
        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nFor Loop:");
        // Iterate using for-loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
