import java.util.*;
public class PrintAllDivisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();


//-----------------------Brute---------------------

        // for(int i=1; i<=n; i++){
        //     if(n % i == 0){
        //         System.out.print(i+" ");
        //     }
        // }

//----------------------Optimal---------------------

            for(int i=1; /*i<=Math.sqrt(n)*/ i*i<=n; i++){
                if(n % i == 0){
                    System.out.print(i+" ");
                if((n / i) != i)
                    System.out.print(n/i+" ");
                }
            }
    }
}
