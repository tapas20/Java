import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("Australia", 150);
        tm.put("China", 45);
        tm.put("Indonesia", 55);

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("Australia", 150);
        hm.put("China", 45);
        hm.put("Indonesia", 55);

        System.out.println(hm);
        System.out.println(tm);
    }
}
