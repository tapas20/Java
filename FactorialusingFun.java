import java.util.*;
public class FactorialusingFun {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int factorial=fact(n);
        System.out.println("The Factorial of this number is : " +factorial);
    }
}
