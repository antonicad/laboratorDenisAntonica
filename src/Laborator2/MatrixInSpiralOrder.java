package Laborator2;

public class MatrixInSpiralOrder {
	public static void main(String[] args) {
        int[][] mat =
        {
            { 1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
 
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
 
        printSpiral(mat, top, bottom, left, right);
	}
	
    private static void printSpiral(
    		int mat[][], 
    		int top, 
    		int bottom,
	        int left, 
	        int right
    ) {
		// print top row
		for (int i = left; i <= right; i++) {
			System.out.print(mat[top][i] + " ");
		}
		top++; // 0 =>1
		
		if (top > bottom) {
			return;
		}
		
		// print right column
		for (int i = top; i <= bottom; i++) {
			System.out.print(mat[i][right] + " "); // mat[1][4], mat[2][4], mat[3][4], mat[4,4]
		}
//		right--;  4 =>3
		
		if (left > right) {
			return;
		}
		
		// print bottom row
		for (int i = right; i >= left; i--) {
			System.out.print(mat[bottom][i] + " "); // mat[4][3], mat[4][2], mat[4][1], mat[4][0]
		}
		bottom--; // 4 => 3
		
		if (top > bottom) {
			return;
		}
		
		// print left column
		for (int i = bottom; i >= top; i--) { 
			System.out.print(mat[i][left] + " "); // mat[3][0], mat[2][0], mat[1][0]
		}
		left++;
		
		printSpiral(mat, top, bottom, left, right);
	}
}
