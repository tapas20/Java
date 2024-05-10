import java.util.*;
public class NumberPyramid {
    public static void Number_Pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for Number
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 'n' value : ");
        int n=sc.nextInt();
        Number_Pyramid(n);
    }
}
