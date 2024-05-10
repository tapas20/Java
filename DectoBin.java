import java.util.*;
public class DectoBin {
    public static void Decimalnum(int num){
        int mynum=num;
        int pow=0;
        int bin=0;
        while(num>0){
            int rem=num%2;
            bin=bin+rem*(int)(Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.println("Decimal Number : "+mynum+" : to Binary Number : "+bin);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int num=sc.nextInt();
        Decimalnum(num);
    }
}
