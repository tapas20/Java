import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.Arrays;

public class RecursionYT {
    public static void main(String[] args){
        Dice("", 4);
    }
    //Returning in arrayList


    static ArrayList<String> Diceret(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i=1 ; i<=6 && i<= target ; i++){
            list.addAll(Diceret(p+i, target-i));
        }
        return list;
    }

    //Dice combinations
    static void Dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return ;
        }

        for(int i=1 ; i<=6 && i<= target ; i++){
            Dice(p+i, target-i);
        }
    }



     //Leetcode PhonePad Question

     static void pad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i=(digit-1)*3 ; i<digit*3 ; i++){
            char ch = (char)('a'+i);
            pad(p + ch, up.substring(1));
        }
     }

     //Returning in an ArrayList

     static ArrayList<String> pads(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for(int i=(digit-1)*3 ; i<digit*3 ; i++){
            char ch = (char)('a'+i);
            list.addAll(pads(p + ch, up.substring(1)));
        }
        return list;
     }


     //Return count

     static int padscount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';


        for(int i=(digit-1)*3 ; i<digit*3 ; i++){
            char ch = (char)('a'+i);
            count += padscount(p + ch, up.substring(1));
        }
        return count;
     }


     //permutation
     static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i=0 ;i<= p.length() ; i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            permutations(f + ch + s, up.substring(1));
        }
     }

     //Returning permutation ans in an ArrayList
     static ArrayList<String> permutationsList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0 ;i<= p.length() ; i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
     }

     //Return Count
     static int permutationsCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
    
        for(int i=0 ;i<= p.length() ; i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            count += permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
     }






     // Subset (By using iteration)
    //  static List<List<Integer>> subset(int[] arr){
    //      List<List<Integer>> outer = new ArrayList<>();
     
    //      outer.add(new ArrayList<>());
     
    //      for(int num : arr){
    //          int n = outer.size();
    //          for(int i=0; i<n; i++){
    //              List<Integer> internal = new ArrayList<>(outer.get(i));
    //              internal.add(num);
    //              outer.add(internal);
    //          }
    //      }
    //      return outer;
    //  }
     




    //Returning the answer in an ArrayList(inside Function body)& Ascii value
    static  ArrayList<String> subseqRetAcii(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqRetAcii(p + ch, up.substring(1));
        ArrayList<String> second = subseqRetAcii(p , up.substring(1));
        ArrayList<String> third = subseqRetAcii(p + (ch+0) , up.substring(1));


        first.addAll(second);
        first.addAll(third);
        return first;
    }




    //Printing SubSequence & Ascii value of a String
    static void subseqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p , up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }



    //Returning the answer in an ArrayList(inside Function body)
    static  ArrayList<String> subseqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p , up.substring(1));

        left.addAll(right);
        return left;
    }



    //Printing SubSequence of a String
    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p , up.substring(1));
    }


    //Skip "apple"
    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else{
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }

    //Remove app when it is not apple
    static String skipappNotapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipappNotapple(up.substring(3));
        }else{
            return up.charAt(0) + skipappNotapple(up.substring(1));
        }
    }

    //String (character skip)operation 
    //------------------Approach-1------------------------
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    //--------------------Approach-2---------------------------
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }



    //Quick sort
    public static void sort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s <= e){

            // also a reason why if its already sorted it will not swap
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct index , please sort two halves now
        sort(arr, low, e);
        sort(arr, s, high);
    }



    //Merge Sort
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] Left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] Right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(Left , Right);
    }
    
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // If one of the array is not complete copy the remaining element int the array.
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

//---------------------Inplace------------------------
    static void mergeSortInplace(int[] arr,int s,int e){
        if(e - s == 1){
            return ;
        }

        int mid = (s + e) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeInplace(arr ,s, mid ,e);
    }
    
    private static void mergeInplace(int[] arr, int s , int m , int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // If one of the array is not complete copy the remaining element in the array.
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0 ; l < mix.length ; l++){
            arr[s+l] = mix[l];
        }
    }





    //Selection Sort
    public static void Selectionsrt(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                Selectionsrt(arr, r, c+1, c);
            }else{
                Selectionsrt(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            Selectionsrt(arr, r-1, 0, 0);
        }
    }


    
    //Bubble Sort
    public static void bubble(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r, c+1);
        }else{
            bubble(arr,r-1, 0);
        }
    }



    //Triangle Using Recursion

    public static void pattern2(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            pattern2(r, c+1);
            System.out.print("*");
        }else{
            pattern2(r-1, 0);
            System.out.println();
        }
    }



    public static void pattern(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("*");
            pattern(r, c+1);
        }else{
            System.out.println();
            pattern(r-1, 0);
        }
    }

    //Binary Search for Rotated Array
    public static int Bsr(int arr[], int target , int s , int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return Bsr(arr, target, s, mid-1);
            }else{
                return Bsr(arr, target, mid+1, e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return Bsr(arr, target, mid+1, e);
        }else{
            return Bsr(arr, target, s, mid-1);
        }
    }



    //linear Search
    public static boolean search(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }
    public static int searchindex(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return searchindex(arr, target, index+1);
        }
    }
    public static int searchindexback(int[] arr , int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return searchindex(arr, target, index-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void searchAllindex(int[] arr , int target , int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchAllindex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllList(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllList(arr, target, index + 1, list);
    }


    static ArrayList<Integer> findAllList2(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllList2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }



    //check if the array is sorted or not
    public static boolean sorted(int arr[] , int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }

    //count Zero's
    public static int count(int n){
        return helper(n , 0);
    }
    private static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
    
    //Reverse a number
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper1(n,digits);
    }
    private static int helper1(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    //palindrome
    static boolean palindrome(int n){
        return n == rev2(n);
    }



    static int sum=0;
    public static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }

    public static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //n-- vs --n
        concept(--n);
    }
    //Digit Sum
    public static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
    //Digit mul
    public static int digitmul(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * digitmul(n/10);
    }

    //factorial
    public static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }

    //N to 1
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    //binary search
    public static int bin(int arr[] , int target , int s , int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return bin(arr, target, s, m-1);
        }
            return bin(arr, target, m+1, e);
    }


    // n fibonacci
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    //print from n to 1
    public static void print1(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
