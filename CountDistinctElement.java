import java.util.*;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] num = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        Set<Integer> set = new HashSet<Integer>();

        for (Integer i : num) {
            set.add(i);
        }

        System.out.println(set.size());
    }
}