import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("China", 150);
        map.put("USA", 30);
        System.out.println(map);
        map.put("China",130);
        System.out.println(map); //new value replaced the old value.

        //Search
        if(map.containsKey("China")){
            System.out.println("The key is exist in the map");
        }else{
            System.out.println("The key is not exist in the map");
        }

        //key doesnot exist
        if(map.containsKey("Indonesia")){ 
            System.out.println("The key is exist in the map");
        }else{
            System.out.println("The key is not exist in the map");
        }

        //to get the value of the key
        System.out.println(map.get("USA")); //key exist
        System.out.println(map.get("Indonesia")); //key doesnot exist

        int arr[] = {10,20,30};

        //simple for loop
        for(int i=0 ; i<3 ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //Shortcut forloop
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        //Iteration in HashMap
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Another way Using set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //Remove an entry
        map.remove("China");
        System.out.println(map);
    }
}
