import java.util.*;
// public class Arraylist {
//     public static void main(String[] args){
//         ArrayList<Integer> list = new ArrayList<>();

//         //add elements
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         // get elements
//         int index = list.get(3);
//         System.out.println(index);


//         //Add elenemt in Between
//         list.add(2,6);
//         System.out.println(list);

//         //Set element
//         list.set(0,10);
//         System.out.println(list);

//         //delete elment
//         list.remove(5);
//         System.out.println(list);

//         //size
//         int size = list.size();
//         System.out.println(size);

//         //loop
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }
//         System.out.println();

//         //sorting
//         Collections.sort(list);
//         System.out.print(list);
//     }
// }


/**
 * Arraylist
 */
// public class Arraylist {

//     public static void main(String[] args) {
        //Syntax
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // list1.add(10); // Tc --> O(1)
        // list1.add(20);
        // list1.add(90);
        // list1.add(40);
        // list1.add(50);
        // System.out.println(list1);

        //Get Operation

        // int element = list1.get(2); // Tc --> O(1)
        // System.out.println(element);

        //Delete

        // list1.remove(3);
        // System.out.println(list1);

        //Set

        // list1.set(3, 100);
        // System.out.println(list1);


        //contains

        // System.out.println(list1.contains(20));
        // System.out.println(list1.contains(11));


        //Size
        // System.out.println(list1.size());


        //printing ArrayList

        // for(int i=0; i<list1.size(); i++) {
        //     System.out.print(list1.get(i)+" ");
        // }


        //print Reverse of an ArrayList
        // for(int i=list1.size()-1; i>=0; i--) {
        //     System.out.print(list1.get(i) + " ");
        // }


        //find the maximum
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list1.size(); i++) {
        //     max = Math.max(max, list1.get(i));
        // }
        // System.out.println(" The max element is : " + max);


        //swap
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // System.out.println(list);
        // int idx1 = 1, idx2 = 3;
        // int temp = list.get(idx1);
        // list.set(idx1, list.get(idx2));
        // list.set(idx2, temp);
        // swap(list, idx1, idx2);
        // System.out.println(list);


        //---------------------Sorting ArrayList----------------------
    //     Collections.sort(list);
    //     System.out.println(list);

    //     //Descending
    //     Collections.sort(list, Collections.reverseOrder());
    //     System.out.println(list);




        //-------------------------MultiDimentional ArrayList--------------------------
    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    //     ArrayList<Integer> list1 = new ArrayList<>();
    //     list1.add(1); list1.add(2); list1.add(3);
    //     mainList.add(list1);

    //     ArrayList<Integer> list2 = new ArrayList<>();
    //     list2.add(2); list2.add(4); list2.add(6);
    //     mainList.add(list2);

    //     ArrayList<Integer> list3 = new ArrayList<>();
    //     list3.add(3); list3.add(6); list3.add(9);
    //     mainList.add(list3);

    //     // System.out.println(mainList);

    //     for(int i=0; i<mainList.size(); i++) {
    //         ArrayList<Integer> currList = mainList.get(i);
    //         for(int j=0; j<currList.size(); j++) {
    //             System.out.print(currList.get(j) + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
// }



//------------Maximum Water Stored in an ArrayList--------------

/**
 * Arraylist
 */
// public class Arraylist {

//--------------------------BruteForce[O(n^2)]---------------------------

    // public static int storeWater(ArrayList<Integer> height) {
        // int maxWater = Integer.MIN_VALUE;
        // for(int i=0; i<height.size(); i++) {
        //     for(int j=i+1; j<height.size(); j++) {
        //         int y = Math.min(height.get(i), height.get(j));
        //         int x = j-i;
        //         int currwater = y*x;
        //         maxWater = Math.max(maxWater, currwater);
        //     }
        // }
        // return maxWater;
    // }

//----------------------------Optimal[O(n)]----------------------------
//     public static int storeWater(ArrayList<Integer> height, int Lp, int Rp) {
//         int maxWater = Integer.MIN_VALUE;
//         while(Lp < Rp) {
//             int y = Math.min(height.get(Lp), height.get(Rp));
//             int x = Rp-Lp;
//             int currwater = y*x;
//             maxWater = Math.max(maxWater, currwater);
        
//             if(height.get(Lp) < height.get(Rp)) {
//                 Lp++;
//             } else {
//                 Rp--;
//             }
//         }
//         return maxWater;
//     }

//     public static void  main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         //1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         int ans = storeWater(height, 0, height.size()-1);
//         System.out.println(ans);
//     }
// }

/**
 * Arraylist
 */
// public class Arraylist {
// //--------------------------------------Optimal----------------------------------------
//     public static ArrayList<Integer> findPair(ArrayList<Integer> list, int target) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         int lp = 0;
//         int rp = list.size()-1;
//         while(lp < rp) {
//             if(list.get(lp) + list.get(rp) == target) {
//                 ans.add(lp);
//                 ans.add(rp);
//                 break;
//             } else if(list.get(lp) + list.get(rp) < target) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return ans;
//     }

//-------------------------------------BruteForce---------------------------------------

    // public static ArrayList<Integer> findPair(ArrayList<Integer> list, int target) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for(int i=0; i<list.size(); i++) {
    //         for(int j=i+1; j<list.size(); j++) {
    //             if(list.get(i) + list.get(j) == target) {
    //                 ans.add(i);
    //                 ans.add(j);
    //             }
    //             break;
    //         }
    //     }
    //     return ans;
    // }
    //Two sum
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);

//         int target = 5;

//         System.out.println(findPair(list, target));
//     }
// }



/**
 * Arraylist
 */
public class Arraylist {
    public static ArrayList<Integer> pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int pivot = -1;
        for(int i=0; i<n-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                pivot = i;
                break;
            }
        }
        int rp = pivot;
        int lp = pivot + 1;
        while (rp != lp) {
            if(list.get(lp) + list.get(rp) == target) {
                ans.add(lp);
                ans.add(rp);
                break;
            } else if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum2(list, 16));
    }
}