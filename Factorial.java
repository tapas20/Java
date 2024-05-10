import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int f=1;


        /*for(int i=1;i<=n;i++){
            f=f*i;
        }*/

        for(int i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println("Factorial of the Number is="+f);
    }
}
