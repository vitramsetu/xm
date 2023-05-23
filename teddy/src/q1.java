/*
1.1
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1};
        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Array with duplicates: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Array without duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueList.add(num);
            }
        }

        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }

        return uniqueArr;
    }
}
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7};

        int[] commonElements = findCommonElements(arr1, arr2);

        System.out.print("Common elements: ");
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> commonList = new ArrayList<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        for (int num : set1) {
            if (set2.contains(num)) {
                commonList.add(num);
            }
        }

        int[] commonArr = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            commonArr[i] = commonList.get(i);
        }

        return commonArr;
    }
}
