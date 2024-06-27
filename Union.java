import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        Set<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (Integer j : arr2) {
            set.add(j);
        }

        System.out.println(set);

        System.out.println("Size = " + set.size());
    }
}
