import java.util.*;
public class WaveTraversal {
    public static void wave_traversal(int matrix[][]){
        for(int j=0;j<matrix[0].length;j++){
            if(j%2==0){
                for(int i=0;i<matrix.length;i++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else{
                for(int i=matrix.length-1;i>=0;i--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of matrix Array: ");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int matrix[][]=new int[m][n];
    System.out.println("Enter all the value of matrix : ");
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    wave_traversal(matrix);
   } 
}
