import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 6, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> Keys = map.keySet();
        
        for (Integer key : Keys) {
            int val = map.get(key);
            if(val > n/3) {
                System.out.println(key);
            }
        }
    }
}
