import java.util.*;
public class FloydsPattern {
    public static void Floyds_Pattern(int n){
        int t=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t++;
            }
           
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Number of Lines : ");
        int n=sc.nextInt();
        Floyds_Pattern(n);
    }
}
