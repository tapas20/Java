import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int org_num =num;
        int rev=0,rem;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
             if(org_num==rev){
                System.out.println(org_num + " it is a palindrome number");
             }
             else{
                System.out.println(org_num + " it is not a palindrome number");
             }
    }
       

}
