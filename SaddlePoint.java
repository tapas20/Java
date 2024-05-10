import java.util.*;
public class SaddlePoint {
    public static void Saddle_point(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            int small=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][small] > matrix[i][j]){
                small=j;
                }
            }

            boolean flag=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][small] > matrix[i][small]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(matrix[i][small]);
                return;
            }
        }
        System.out.println("Invalid Input");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Matrix : ");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Saddle_point(matrix);
    }
}
