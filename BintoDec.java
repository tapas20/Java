import java.util.*;
public class BintoDec {
    public static void Binarynum(int num){
        int mynum=num;
        int pow=0;
        int decimal=0;
        while(num>0){
            int Lastdigit=num%10;
            decimal=decimal+(Lastdigit*((int)(Math.pow(2,pow))));
            pow++;
            num=num/10;
        }
        System.out.println("Binary : "+mynum+" to Decimal : "+decimal);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Number : ");
        int num=sc.nextInt();
        Binarynum(num);
    }
}
