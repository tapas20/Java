import java.util.*;
public class HollowRhombus {
    public static void Hollow_Rhombus(int n){
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for colons
            for(int k=1;k<=n;k++){
                if(i==1 || i==n || k==1 || k==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n=sc.nextInt();
        Hollow_Rhombus(n);
    }
}
