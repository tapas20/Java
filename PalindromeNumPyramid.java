import java.util.*;
public class PalindromeNumPyramid {
    public static void Palindrome_pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for Descending order
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            //inner loop for Ascending order
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n=sc.nextInt();
        Palindrome_pyramid(n);
    }
}
