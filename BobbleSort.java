import java.util.*;
public class BobbleSort{
    public static void Bobble_sort(int arr[]){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            int swapped=0;
            for(int j=0;j<=i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=1;
                }
            }
            if(swapped==0){
                break;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
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
        Bobble_sort(arr);    
    }
}