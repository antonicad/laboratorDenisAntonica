package Laborator1;

public class NotShading {
	public static void main(String[] args) {
		int n = 2;
        int m = 3;
        int r = 2;
        int c = 2;
        String[] lines = { 
        	"BWW",
        	"WWW"
        };
 
        r--; c--;
 
        boolean[][] grid = new boolean[n][m];
        boolean hasBlack = false;
 
        for (int j = 0; j < n; j++) {
            String line = lines[j];
            for (int k = 0; k < m; k++) {
                grid[j][k] = (line.charAt(k) == 'B');
                hasBlack |= grid[j][k];
            }
        }
 
        if (!hasBlack) {
            System.out.println(-1);
        } else if (grid[r][c]) {
        	System.out.println(0);
        } else {
            boolean ok = false;
 
            for (int j = 0; j < n; j++) {
                ok |= grid[j][c];
            }
 
            for (int k = 0; k < m; k++) {
                ok |= grid[r][k];
            }
 
            if (ok) {
            	System.out.println(1);
            } else {
            	System.out.println(2);
            }
        }
	}
}
