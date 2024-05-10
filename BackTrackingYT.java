import java.util.ArrayList;
import java.util.Arrays;

public class BackTrackingYT {
    public static void main(String[] args){
        // System.out.println(maze(3, 3));
        // path("", 3, 3);
        // System.out.println(pathRet("", 3, 3));
        // System.out.println(pathRetDiagonal("", 3, 3));
        // boolean[][] board = {
        //     {true, true, true},
        //     {true, false, true},
        //     {true, true, true},
        // };
        // System.out.println(pathRestrictionRet("", board, 0, 0));
        // boolean[][] board = {
        //     {true, true, true},
        //     {true, true, true},
        //     {true, true, true},
        // };
        // int[][] path = new int[board.length][board[0].length];
        // allPathsPrint("", board, 0, 0, path, 1);
        // int n = 5;
        // boolean[][] board = new boolean[n][n];
        // System.out.println(queens(board, 0));

        // int n = 4;
        // boolean[][] board = new boolean[n][n];
        // knight(board, 0, 0, n);

        int[][] board = new int[][]{
            {3,0,6,5,0,8,4,0,0},
            {5,2,0,0,0,0,0,0,0},
            {0,8,7,0,0,0,0,3,1},
            {0,0,3,0,1,0,0,8,0},
            {9,0,0,8,6,3,0,0,5},
            {0,5,0,0,9,0,6,0,0},
            {1,3,0,0,0,0,2,5,0},
            {0,0,0,0,0,0,0,7,4},
            {0,0,5,2,0,6,3,0,0}
        };
        if(solve(board)){
            disPlay(board);
        }else{
            System.out.println("Can't solved!");
        }
    }

    //Sudoku solver


    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, then break
            if(emptyLeft == false){
                break;
            }
        }
        if(emptyLeft == true){
            return true;
            //sudoku is solved;
        }

        //backtrack
        for(int number = 1; number <= n; number++){
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    //found the answer
                    //disPlay(board);
                    return true;
                }else{
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void disPlay(int[][] board) {
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        //check the row
        for(int i=0; i<board.length; i++){
            //check if the number is in the row
            if(board[row][col] == num){
                return false;
            }
        }

        //check for col
        for(int[] nums : board){
            //check if the number is in the col
            if(nums[col] == num){
                return false;
            }
        }

        //check for small Matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        
        for(int r=rowStart; r<rowStart + sqrt; r++){
            for(int c=colStart; c<colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
    // tc--> O(n^n^2)
    // sc-->O(n^2)


    //Nknights

    static void knight(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            Display(board);
            System.out.println();
            return;
        }
        if(row == board.length-1 && col == board.length){
            return;
        }
        if(col == board.length){
            knight(board, row+1, 0, knights);
            return;
        }
        if(IsSafe(board, row, col)){
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knights);

    }
    
    private static boolean IsSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        if(isValid(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }
        if(isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void Display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


    //N-Queen Problems
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }


    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }



    //Printing All the path also
    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length-1){
            for(int[] arr:path){
                path[r][c] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c] == false){ //(!maze[r][c]) we can write this also.
            return;
        }
        //i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            allPathsPrint(p + 'D', maze, r+1, c, path, step+1);
        }
        if(c < maze[0].length-1){
            allPathsPrint(p + 'R', maze, r, c+1, path, step+1);
        }
        if(r > 0){
            allPathsPrint(p + 'U', maze, r-1, c, path, step+1);
        }
        if(c > 0){
            allPathsPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        //this line is where the function will be over
        //so before the fuunction gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }




    //All Paths
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){ //(!maze[r][c]) we can write this also.
            return;
        }
        //i am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length-1){
            allPaths(p + 'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            allPaths(p + 'R', maze, r, c+1);
        }
        if(r > 0){
            allPaths(p + 'U', maze, r-1, c);
        }
        if(c > 0){
            allPaths(p + 'L', maze, r, c-1);
        }

        //this line is where the function will be over
        //so before the fuunction gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }


    //Path with some Obstacles
    static void pathRestriction(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){ //(!maze[r][c]) we can write this also.
            return;
        }
        if(r < maze.length-1){
            pathRestriction(p + 'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            pathRestriction(p + 'R', maze, r, c+1);
        }
    }


    //Return into an ArrayList

    static ArrayList<String> pathRestrictionRet(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(maze[r][c] == false){ //(!maze[r][c]) we can write this also.
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(r < maze.length-1){
            list.addAll(pathRestrictionRet(p + 'D', maze, r+1, c));
        }
        if(c < maze[0].length-1){
            list.addAll(pathRestrictionRet(p + 'R', maze, r, c+1));
        }
        return list;
    }

    //Going Diagonally
    public static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }
        if(r > 1){
            list.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }
        if(c > 1){
            list.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }
        return list;
    }

    //Returning the Count

    public static int maze(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = maze(r-1, c);
        int right = maze(r, c-1);

        return left + right;
    }

    //Returning the Path

    public static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + 'D', r-1, c);
        }
        if(c > 1){
            path(p + 'R', r, c-1);
        }
    }

    //Returning in to an ArrayList

    public static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathRet(p + 'D', r-1, c));
        }
        if(c > 1){
            list.addAll(pathRet(p + 'R', r, c-1));
        }
        return list;
    }
}
