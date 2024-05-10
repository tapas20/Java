public class SpiralMatrix {
    public static void spiral_Matrix(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
        
    }
    public static void main(String[] args){
       int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiral_Matrix(matrix); 
    }
}
//import java.util.*;
// public class Test{
//     public static void spiral_matrix(int matrix[][]){
//         int startRow=0;
//         int startCol=0;
//         int endRow=matrix.length-1;
//         int endcol=matrix[0].length-1;
//         while(startRow<=endRow && startCol<=endcol){
//         //top
//         for(int j=startRow;j<=endcol;j++){
//             System.out.print(matrix[startRow][j]+" ");
//         }
//         //right
//         for(int i=startRow+1;i<=endRow;i++){
//             System.out.print(matrix[i][endcol]+" ");
//         }
//         //bottom
//         for(int j=endcol-1;j>=startCol;j--){
//             if(startRow == endRow){
//                 break;
//             }
//             System.out.print(matrix[endRow][j]+" ");
//         }
//         //left
//         for(int i=endRow-1;i>=startRow+1;i--){
//             if(startCol==endcol){
//                 break;
//             }
//             System.out.print(matrix[i][startCol]+" ");
//         }
//         startRow++;
//         startCol++;
//         endRow--;
//         endcol--;
//      }
//      //System.out.println();

//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of matrix : ");
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         int matrix[][]=new int[m][n];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         spiral_matrix(matrix);
//     }
// }