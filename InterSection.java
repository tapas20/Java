import java.util.*;

public class InterSection {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9, 4 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        int count = 0;

        Set<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int j : arr2) {
            if (set.contains(j)) {
                count++;
                set.remove(j);
                System.out.print(j + ", ");
            }
        }
        System.out.println();

        System.out.println("Count = "+count);
    }
}
