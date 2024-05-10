import java.util.*;
public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Switch : ");
        int ch=sc.nextInt();
        int a=20,b=10;
        switch(ch){
            case 1:System.out.println("Addition of two number : "+ (a+b));
            break;
            case 2:System.out.println("Substraction of two number : "+(a-b));
            break;
            case 3:System.out.println("Multipliction of two number : "+(a*b));
            break;
            case 4:System.out.println("Division of two number : "+(a/b));
            break;
            default:System.out.println("Tapas statements");

        }
    }
}
