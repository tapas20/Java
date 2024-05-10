import java.util.*;
public class Strings {
    public static void Print_Letters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Name : ");
        String Firstname=sc.next();
        System.out.println("Enter the Second Name : ");
        String Secondname=sc.next();
        String Fullname=Firstname+" "+Secondname;
        Print_Letters(Fullname);
    }
}
