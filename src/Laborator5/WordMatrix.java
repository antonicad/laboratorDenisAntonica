package Laborator5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordMatrix {
    // Below arrays detail all eight possible movements from a cell
    // (top, right, bottom, left, and four diagonal moves)
    public static int[] row = { -1, -1, -1, 0, 1, 0, 1, 1 };
    public static int[] col = { -1, 1, 0, -1, -1, 1, 0, 1 };


    public static void main(String[] args)
    {
        char[][] board = {
                {'M', 'S', 'E'},
                {'R', 'A', 'T'},
                {'L', 'O', 'N'}
        };
        Set<String> words = Stream.of("STAR", "NOTE", "SAND", "STONE")
                .collect(Collectors.toSet());

        Set<String> validWords = searchMatrix(board, words);
        System.out.println(validWords);
    }

    // Function to check if it is safe to go to cell (x, y) from the current cell.
    // The function returns false if (x, y) is not valid matrix coordinates
    // or cell (x, y) is already processed.
    public static boolean isValid(int x, int y, boolean[][] processed) {
        return (x >= 0 && x < processed.length) && (y >= 0 && y < processed[0].length)
                && !processed[x][y];
    }

    // A recursive function to generate all possible words in a matrix
    public static void searchMatrix(char[][] board, Set<String> words,
                                    Set<String> result, boolean[][] processed,
                                    int i, int j, String path)
    {
        // mark the current node as processed
        processed[i][j] = true;

        // update the path with the current character and insert it into the set
        path += board[i][j];

        // check whether the path is present in the input set
        if (words.contains(path)) {
            result.add(path);
        }

        // check for all eight possible movements from the current cell
        for (int k = 0; k < row.length; k++)
        {
            // skip if a cell is invalid, or it is already processed
            if (isValid(i + row[k], j + col[k], processed)) {
                searchMatrix(board, words, result, processed, i + row[k],
                        j + col[k], path);
            }
        }

        // backtrack: mark the current node as unprocessed
        processed[i][j] = false;
    }

    // Function to search for a given set of words in a matrix
    public static Set<String> searchMatrix(char[][] board, Set<String> words)
    {
        // construct a set to store valid words constructed from the matrix
        Set<String> result = new HashSet<>();

        // base case
        if (board.length == 0) {
            return result;
        }

        // `M × N` board
        int M = board.length;
        int N = board[0].length;

        // construct a boolean matrix to store whether a cell is processed or not
        boolean[][] processed = new boolean[M][N];

        // generate all possible words in a matrix
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++) {
                // consider each character as a starting point and run DFS
                searchMatrix(board, words, result, processed, i, j, "");
            }
        }

        return result;
    }

}

