package Laborator5;

import java.util.Arrays;

public class ChessQueens {
    static int[] solution;
    static int N;

    public static void main(String[] args) {
        N = 4;
        solution = new int[N];
        placeQueens(0);
    }

    static void placeQueens(int k) {
        int i;
        for (i = 0; i < N; i++) {
            solution[k] = i;
            if (isValid(k)) {
                if (solution(k)) {
                    printTable();
                } else {
                    placeQueens(k + 1);
                }
            }
        }
    }

    static boolean solution(int k) {
        if (k == N - 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isValid(int k) {
        for (int i = 0; i < k; i++)
            if ((solution[i] == solution[k]) || (Math.abs(solution[k] - solution[i]) == k - i)) {
                return false;
            }

        return true;
    }

    static void printTable() {
        System.out.println("========");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (solution[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }

            System.out.println();
        }
    }
}

