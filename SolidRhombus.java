import java.util.*;
public class SolidRhombus {
    public static void paralelo_gram(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the total number of lines : ");
        int n=sc.nextInt();
        paralelo_gram(n);
    }
}
