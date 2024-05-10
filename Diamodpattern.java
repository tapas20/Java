import java.util.*;
public class Diamodpattern {
    public static void Diamod_pattern(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
                }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
                }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n=sc.nextInt();
        Diamod_pattern(n);   
    }
}
