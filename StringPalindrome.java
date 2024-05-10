import java.util.*;
public class StringPalindrome {
    public static boolean is_palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("It is not a palindrome String .");
                return false;
            }
        }
        System.out.println("It is a palindrome String .");
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        is_palindrome(str);
    }
}
