import java.util.*;
public class SumofDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of the Number is="+sum);
    }
}
/*public class SumofDigit{
    public static void main(String[] args){
        int num=1234;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of the Number is="+sum);
    }
} */