import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number:");
       int x=sc.nextInt();
       int count=0;
        for(int i=1;i<=x;i++){
        if(x%i==0)
           count++;
        }
        if(count==2){
            System.out.println("It is a prime Number.");
        }else{
            System.out.println("It is not a prime Number.");
        }


        //2nd approach

        /*int n=5;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("it is not a prime number");
            }else{
                System.out.println("it is a prime number ");
            }
            break;
        }*/
    }
}
