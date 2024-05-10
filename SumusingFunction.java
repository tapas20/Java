import java.util.*;
public class SumusingFunction{
    public static int TotalSum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=TotalSum(a,b); 
        System.out.println("The sum is : "+sum);
    }
}