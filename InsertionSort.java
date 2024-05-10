import java.util.*;
public class InsertionSort {
    public static void Insertion_Sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }else{
                break;
            }
          }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Array : ");
        int n=sc.nextInt();
        System.out.println("Enter all the Arrays : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Insertion_Sort(arr);
    }
}
