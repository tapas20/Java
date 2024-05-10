import java.util.*;
public class HollowSquareStar {
    public static void Hollow_Square(int rows,int colns){
        //outerloop for rows
        for(int i=1;i<=rows;i++){
            //innerloop for colns
            for(int j=1;j<=colns;j++){
                if(i==1 || i==rows || j==1 || j==colns){
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
        System.out.println("Enter Number of Rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter Number of Colons : ");
        int colns=sc.nextInt();
        Hollow_Square(rows, colns);
    }
}
