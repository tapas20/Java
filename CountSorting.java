import java.util.*;
public class CountSorting {
    public static void Count_sort(int arr[]){
       int largest=Integer.MIN_VALUE;
       int n=arr.length;
       for(int i=0;i<n;i++){
        largest=Math.max(largest,arr[i]);
       }
       
       int count[]=new int[largest+1];
       for(int i=0;i<n;i++){
        count[arr[i]]++;
       }

       //sorting
       int j=0;
       for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
       }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();
        System.out.println("Enter all the Arrays : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Count_sort(arr);
    }
}
