import java.util.*;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter the Third Number:");
        int c=sc.nextInt();

        //1st metod-------
        /*if(a<b && a<c){
            System.out.println("The Smallest Number is="+a);
        }else if(b<a && b<c){
            System.out.println("The Smallest Numbercis="+b);
        }else{
            System.out.println("The Smallest Number is="+c);
        }*/


        //2nd Approach using Ternary operator--------------------------
        int small=a<b?a:b;
        int smallest=c<small?a:small;

// or we can directly write here------int smallest=c<(a<b?a:b)?c:a<b?a:b;
        System.out.println("The smallest number is="+smallest);
    }
    
}
