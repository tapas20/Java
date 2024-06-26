import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("India");
        cities.add("China");
        cities.add("Dubai");
        cities.add("Nepal");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("China");
        lhs.add("Dubai");
        lhs.add("Nepal");

        System.out.println(lhs);

        lhs.remove("Dubai");
        
        System.out.println(lhs);
    }
}
