import java.util.*;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("India");
        cities.add("China");
        cities.add("Dubai");
        cities.add("Nepal");

        Iterator itr = cities.iterator();

        // Using while loop
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

        System.out.println();

        // Using for each loop
        for (String city : cities) {
            System.out.print(city + ", ");
        }
    }
}
