import java.util.*;
public class HalfPyramidNumber {
    public static void inverted_HalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of 'n' : ");
        int n=sc.nextInt();
        inverted_HalfPyramid(n);
    }
}
