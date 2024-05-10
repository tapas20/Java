import java.util.*;
public class LargestnuminTwoDarray {
    public static void largestnum(int arr[][]){
        int largest=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("Largest num is : "+largest);
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int arr[][]=new int[m][n]; 
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    largestnum(arr);
 } 
}
