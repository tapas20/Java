import java.util.*;
public class LargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first Number:");
        int a=sc.nextInt();

        System.out.println("Enter the second Number:");
        int b=sc.nextInt();

        System.out.println("Enter the third Number:");
        int c=sc.nextInt();

        //Approach - 1:

        /*if(a>b && a>c){ 
            System.out.println("The largest Number is="+a);
        }else if(b>a && b>c){
            System.out.println("The largest Number is="+b);
        }
        else{
            System.out.println("The largest number is="+c);
        }*/

        //Approach - 2:Using Ternary Operator:


        //int large=a>b?a:b;
        //int largest=c>large?c:large;
        //----------------------------------------------------------------------------------------//
        int largest=c>(a>b?a:b)?c:a>b?a:b;
        System.out.println("The Largest Number is="+largest);
    }
}