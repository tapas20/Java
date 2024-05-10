import java.util.*;
public class InvertedHalfPyramidNum {
    public static void Inverted_num(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 'n' of Lines : ");
        int n=sc.nextInt();
        Inverted_num(n);
    }
}
