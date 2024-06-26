import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 200);
        lhm.put("Pakistan", 180);
        lhm.put("China", 190);

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 200);
        hm.put("Pakistan", 180);
        hm.put("China", 190);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
