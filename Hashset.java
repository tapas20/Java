import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(12);
        set.add(20);
        set.add(25);
        set.add(12);
        set.add(20);

        set.remove(20);
        System.out.println(set);
        if (set.contains(20)) {
            System.out.println("Set contains key");
        } else {
            System.out.println("Set doesnot contains key");
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
