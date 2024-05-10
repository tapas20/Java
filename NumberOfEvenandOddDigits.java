public class NumberOfEvenandOddDigits {
    public static void main(String[] args){
        int num = 2345687;
        int Evencount=0;
        int Oddcount=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                Evencount++;
            }else{
                Oddcount++;
            }
            num=num/10;
        }
        System.out.println("Total Even Count="+Evencount);
        System.out.println("Total Odd Count="+Oddcount);
    }
}
/*import java.util.*;
public class  Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number=");
        int num = sc.nextInt();
        int Evencount=0;
        int Oddcount=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                Evencount++;
            }else{
                Oddcount++;
            }
            num=num/10;
        }
        System.out.println("Total Even Count="+Evencount);
        System.out.println("Total Odd Count="+Oddcount);
    }
}*/

