import java.util.*;
public class Marks {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Marks:");
         int marks=sc.nextInt();


        // String report=marks>=33?"Pass":"Fail";
        // System.out.println("Your Report is : "+report);


        if(marks >= 33){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }
    }
}
