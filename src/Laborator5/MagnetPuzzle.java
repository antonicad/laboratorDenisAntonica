package Laborator5;

public class MagnetPuzzle {
    static int M = 5;
    static int N = 6;
    public static void main(String[] args) {

        int[] top = { 1, -1, -1, 2, 1, -1 };
        int[] bottom = { 2, -1, -1, 2, -1, 3 };
        int[] left = { 2, 3, -1, -1, -1 };
        int[] right = { -1, -1, -1, 1, -1 };

        String[][] rules = {
                {"L","R","L","R","T","T"},
                {"L","R","L","R","B","B"},
                {"T","T","T","T","L","R"},
                {"B","B","B","B","T","T"},
                {"L","R","L","R","B","B"},
        };
        solveMagnets(rules, top, bottom, left, right, 0, 0);
    }

    public static boolean checkConstraints(
            String[][] rules,
            int[] top,
            int[] bottom,
            int[] left,
            int[] right,
            int M,
            int N
    )
    {
        int[] plusCountHorizontally = new int[M];
        int[] minusCountHorizontally = new int[M];

        for (int row = 0; row < M; row++) {
            for (int column = 0; column < N; column++) {
                String charAt = rules[row][column];
                if (charAt == "+") {
                    plusCountHorizontally[row] += 1;
                } else if (charAt == "-") {
                    minusCountHorizontally[row] +=1;
                }
            }
        }

        int[] plusCountVertically = new int[N];
        int[] minusCountVertically = new int[N];

        for (int column = 0; column < N; column++) {
            for (int row = 0; row < M; row++) {
                String charAt = rules[row][column];
                if (charAt == "+") {
                    plusCountVertically[column] += 1;
                } else if (charAt == "-") {
                    minusCountVertically[column] +=1;
                }
            }
        }

        for (int row = 0; row < M; row++) {
            if (left[row] != -1) {
                if (plusCountHorizontally[row] != left[row]) {
                    return false;
                }
            }
            if (right[row] != -1) {
                if (minusCountHorizontally[row] != right[row]) {
                    return false;
                }
            }
        }

        for (int column = 0; column < N; column++) {
            if (top[column] != -1) {
                if (plusCountVertically[column] != top[column]) {
                    return false;
                }
            }
            if (bottom[column] != -1) {
                if (minusCountVertically[column] != bottom[column]) {
                    return false;
                }
            }
        }


        return true;
    }

    public static boolean canInsertPatternHorizontally(
            String[][] rules,
            int i,
            int j,
            String[] pattern
    )
    {
        if (j-1 >=0 && rules[i][j-1] == pattern[0]) {
            return false;
        } else if(i-1>=0 && rules[i-1][j] == pattern[0]) {
            return false;
        } else if (i-1>=0 && rules[i-1][j+1] == pattern[1]) {
            return false;
        } else if(j+2 < rules[0].length && rules[i][j+2] == pattern[1]) {
            return false;
        }

        return true;
    }

    public static boolean canInsertPatternVertically(
            String[][] rules,
            int i,
            int j,
            String[] pattern
    )
    {
        if (j-1 >=0 && rules[i][j-1] == pattern[0]) {
            return false;
        } else if(i-1>=0 && rules[i-1][j] == pattern[0]) {
            return false;
        } else if(j+1 < rules[0].length && rules[i][j+1] == pattern[0]) {
            return false;
        }

        return true;
    }


    public static void solveMagnets(
            String[][] rules,
            int[] top,
            int[] bottom,
            int[] left,
            int[] right,
            int i,
            int j
    )
    {

        if (i == rules.length && j == 0) {
            if (checkConstraints(rules,top, bottom, left, right, M, N)) {
                for (int q = 0; q < M; q++) {
                    for (int w = 0; w< N; w++) {
                        System.out.print(rules[q][w] + " ");
                    }
                    System.out.println();
                }
            }
        } else if (j >= rules[0].length) {
            solveMagnets(rules,top, bottom, left, right, i+1, 0);
        } else {
            // Cell is marked as Left
            if (rules[i][j] == "L") {
                String[] pattern1 = {"+", "-"};
                String[] pattern2 = {"-", "+"};
                String[] pattern3 = {"x", "x"};

                if (canInsertPatternHorizontally(rules, i,j, pattern1)) {
                    rules[i][j] = pattern1[0];
                    rules[i][j+1] = pattern1[1];

                    solveMagnets(rules, top, bottom, left, right, i, j+2);

                    rules[i][j] = "L";
                    rules[i][j+1] = "R";
                }

                if (canInsertPatternHorizontally(rules, i,j, pattern2)) {
                    rules[i][j] =  pattern2[0];
                    rules[i][j+1] = pattern2[1];

                    solveMagnets(rules, top, bottom, left, right, i, j+2);

                    rules[i][j] = "L";
                    rules[i][j+1] = "R";
                }

//				if (true || canInsertPatternHorizontally(rules, i,j, pattern3)) {
                rules[i][j] =  pattern3[0];
                rules[i][j+1] = pattern3[1];

                solveMagnets(rules, top, bottom, left, right, i, j+2);

                rules[i][j] = "L";
                rules[i][j+1] = "R";
//				}
            } else if (rules[i][j] == "T") {
                String[] pattern1 = {"+", "-"};
                String[] pattern2 = {"-", "+"};
                String[] pattern3 = {"x", "x"};

                if (canInsertPatternVertically(rules, i,j, pattern1)) {
                    rules[i][j] = pattern1[0];
                    rules[i+1][j] = pattern1[1];

                    solveMagnets(rules, top, bottom, left, right, i, j+1);

                    rules[i][j] = "T";
                    rules[i+1][j] = "B";
                }

                if (canInsertPatternVertically(rules, i,j, pattern2)) {
                    rules[i][j] = pattern2[0];
                    rules[i+1][j] = pattern2[1];

                    solveMagnets(rules, top, bottom, left, right, i, j+1);

                    rules[i][j] = "T";
                    rules[i+1][j] = "B";
                }

//				if (true || canInsertPatternVertically(rules, i,j, pattern3)) {
                rules[i][j] = pattern3[0];
                rules[i+1][j] = pattern3[1];

                solveMagnets(rules, top, bottom, left, right, i, j+1);

                rules[i][j] = "T";
                rules[i+1][j] = "B";
//				}
            } else {
                solveMagnets(rules, top, bottom, left, right, i, j+1);
            }
        }

    }
}

