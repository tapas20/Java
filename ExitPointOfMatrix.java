import java.util.*;
public class ExitPointOfMatrix {
    public static void Exit_point(int matrix[][]){
        int dir=0;   //0-e,1-s,2-w,3-n
        int i=0;
        int j=0;
        dir=(dir + matrix[i][j])%4;
        while(true){
            if(dir==0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }
            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==matrix.length){
                i--;
                break;
            }else if(j==matrix[0].length){
                j--;
                break;
            }
        }
        System.out.print(i+" ");
        System.out.print(j+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the elements of Array :");
        int matrix[][]=new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Exit_point(matrix);
    }
}
