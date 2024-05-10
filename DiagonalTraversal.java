import java.util.*;
public class DiagonalTraversal {
    public static void Diagonal_Traverse(int matrix[][]){
        for(int g=0;g<matrix.length;g++){
            for(int i=0,j=g;j<matrix[0].length;i++,j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of matrix : ");
       int n=sc.nextInt();
       int matrix[][]=new int[n][n];
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=sc.nextInt();
        }
       }
       Diagonal_Traverse(matrix); 
    }
    
}
