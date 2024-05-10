public class SearchInSortedMatrix {
    public static boolean Search_Matrix(int matrix[][],int key){
        int i=0 , j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==key){
                System.out.print("Found key at"+"("+i+","+j+")");
                return true;
            }
            else if(key < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.print("Key Not found !");
        return false;
    }
    public static void main(String[] args){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key =33;
        Search_Matrix(matrix, key);                
    }
}
