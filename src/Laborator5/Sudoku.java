package Laborator5;

public class Sudoku {
    public static void main(String[] args)
    {
        int grid[][] =
                {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        if (SolveSudoku(grid, 9) ) {
            printGrid(grid, 9);
        } else {
            System.out.println("Initial state is unsolvable");
        }
    }

    public static boolean isValid(int row, int col, int i, int grid[][], int N)
    {
        for(int k =0; k<N; k++) {
            if(grid[row][k]==i || grid[k][col]==i) {
                return false;
            }
        }

        int rs = row - (row%3), cs = col - (col%3);

        for(int k =0; k<3; k++){
            for(int l =0; l<3; l++) {
                if(grid[rs+k][cs+l]==i) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean SolveSudoku(int grid[][], int N)
    {
        int col =-1, row =-1;
        boolean flag = false;
        for(int i =0; i<N; i++){
            for(int j =0; j<N; j++){
                if(grid[i][j]==0){
                    row = i;
                    col = j;
                    flag = true;
                    break;
                }
            }
//	           if(flag) {
//	        	   break;
//	           }
        }

        if(!flag) {
            return true;
        }

        for(int i = 1; i<=N; i++){
            if(isValid(row, col, i, grid, N)){
                grid[row][col] = i;
                if(SolveSudoku(grid, N)) {
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }

    //Function to print grids of the Sudoku.
    public static void printGrid (int grid[][], int N)
    {
        // Your code here
        for(int i =0; i<N; i++){
            for(int j =0; j<N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
