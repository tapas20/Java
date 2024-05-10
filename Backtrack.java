// public class Backtrack {
//     public static void changeArr(int[] arr, int i, int val){
//         if(i == arr.length){
//             printArr(arr);
//             return;
//         }

//         arr[i] = val;
//         changeArr(arr, i+1, val+1);
//         arr[i] = arr[i] - 2;
//     }
//     public static void printArr(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int[] arr = new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
//     }
// }


/**
 * Backtrack
 */
// public class Backtrack {
//     public static void findSubstring(String str, String ans, int i){
//         //baseCase
//         if(i == str.length()){
//             if(ans.length() == 0){
//                 System.out.println("null");
//             } else {
//                 System.out.println(ans);
//             }
//             return;
//         }
//         //add
//         findSubstring(str, ans+str.charAt(i), i+1);
//         //notAdd
//         findSubstring(str, ans, i+1);
//     }
//     public static void main(String[] args){
//         String str = "abc";
//         findSubstring(str, "", 0);
//     }
// }

/**
 * Backtrack
 */
// public class Backtrack {

//     public static void findSubstring(String str, StringBuilder ans, int i){
//         if(i == str.length()){
//             if(ans.length() == 0){
//                 System.out.println("null");
//             }else{
//                 System.out.println(ans);
//             }
//             return;
//         }
        
//         findSubstring(str, ans.append(str.charAt(i)), i+1);
//         ans.deleteCharAt(ans.length()-1);//backtrack

//         findSubstring(str, ans, i+1);
//     }
//     public static void main(String[] args){
//         String str = "abc";
//         findSubstring(str, new StringBuilder(), 0);
//     }
// }

/**
 * Backtrack
 */
// public class Backtrack {

//     public static void permutation(String str, String ans) {
//         //baseCase
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0; i<str.length(); i++) {
//             char curr = str.charAt(i);
//             String newStr = str.substring(0,i) + str.substring(i+1);
//             permutation(newStr, ans + curr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         permutation(str, "");
//     }
// }

/**
 * Backtrack
 */
// public class Backtrack {
//     public static boolean isSafe(char[][] board, int row, int col) {
//         //verticallyUp
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //diagonalleft Up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         //diagonalright Up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void nQueens(char[][] board, int row) {
//         //baseCase
//         if(row == board.length) {
//             printBoard(board);
//             return;
            
//         }
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'X';
//             } 
//         }
//     }
    
//     public static void printBoard(char[][] board) {
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int n = 4; 
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'X';
//             }
//         }

//         nQueens(board, 0);
//     }
// }


// public class Backtrack {
//     public static boolean isSafe(char[][] board, int row, int col) {
//         //verticallyUp
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //diagonalleft Up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         //diagonalright Up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void nQueens(char[][] board, int row) {
//         //baseCase
//         if(row == board.length) {
//             // printBoard(board);
//             count++;
//             return;
            
//         }
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'X';
//             } 
//         }
//     }
    
//     public static void printBoard(char[][] board) {
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }

//     static int count = 0;
//     public static void main(String[] args) {
//         int n = 5; 
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'X';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("Total Ways to solve nQueens : "+ count);
//     }
// }


// public class Backtrack {
//     public static boolean isSafe(char[][] board, int row, int col) {
//         //verticallyUp
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //diagonalleft Up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         //diagonalright Up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static boolean nQueens(char[][] board, int row) {
//         //baseCase
//         if(row == board.length) {
//             // printBoard(board);
//             return true;
            
//         }
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 if(nQueens(board, row+1)){
//                     return true;
//                 }
//                 board[row][j] = 'X';
//             } 
//         }
//         return false;
//     }
    
//     public static void printBoard(char[][] board) {
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int n = 4; 
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'X';
//             }
//         }

//         if(nQueens(board, 0)){
//             System.out.println("Solution is possible");
//             printBoard(board);
//         } else {
//             System.out.println("Solution is not Possible");
//         }
//     }
// }

/**
 * Backtrack
 */
// public class Backtrack {

//     public static int findallGrid(int i, int j, int m, int n) {
//         //baseCase
//         if(i == m-1 || j == n-1) {
//             return 1;
//         } else if(i == m || j == n) {
//             return 0;
//         }

//         int w1 = findallGrid(i+1, j, m, n);
//         int w2 = findallGrid(i, j+1, m, n);
        
//         return (w1+w2);
//     }
//     public static void main(String[] args) {
//         int m=3, n=3;
//         System.out.println(findallGrid(0, 0, m, n));
//     }
// }



/**
 * Backtrack
 */
public class Backtrack {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //vertically
        for(int i=0; i<sudoku.length; i++) {
            if(sudoku[i][col] == digit) {
                return false;
            }
        }

        //horizontally
        for(int j=0; j<sudoku.length; j++) {
            if(sudoku[row][j] == digit) {
                return false;
            }
        }

        //small matrix
        int smi = row / 3 * 3;
        int smj = col / 3 * 3;
        for(int i=smi; i<smi+1; i++) {
            for(int j=smj; j<smj+1; j++) {
                if((sudoku[smi][smj]) == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        //base case
        if(row == sudoku.length) {
            return true;
        }
        //recursion
        int nxtrow = row, nxtcol = col+1; 
        if(col+1 == sudoku.length) {
            nxtrow = row+1;
            nxtcol = 0;
        }
        if(sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nxtrow, nxtcol);
        }

        for(int digit=1; digit<=9; digit++) {
            if(isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nxtrow, nxtcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int[][] sudoku) {
        for(int i=0; i<sudoku.length; i++) {
            for(int j=0; j<sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3} };
        if(sudokuSolver(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution does not exist");
        }
    }
}