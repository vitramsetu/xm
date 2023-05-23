import java.util.*;

public class q23 {
    public static int findLongestConsecutiveSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
        int longestSequenceLength = findLongestConsecutiveSequence(nums);
        System.out.println("The length of the longest consecutive sequence is: " + longestSequenceLength);
    }
}


