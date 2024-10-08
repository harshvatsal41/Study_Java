package com.start.HashMap;

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {
    private static final int N = 8;

    public static List<List<Integer>> solveNQueens() {
        List<List<Integer>> solutions = new ArrayList<>();
        int[] board = new int[N];
        placeQueens(0, board, solutions);
        return solutions;
    }

    private static void placeQueens(int row, int[] board, List<List<Integer>> solutions) {
        if (row == N) {
            List<Integer> solution = new ArrayList<>();
            for (int col : board) {
                solution.add(col);
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isValidPlacement(row, col, board)) {
                board[row] = col;
                placeQueens(row + 1, board, solutions);
            }
        }
    }

    private static boolean isValidPlacement(int row, int col, int[] board) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(board[i] - col);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> solutions = solveNQueens();

        for (List<Integer> solution : solutions) {
            System.out.println(solution);
        }
    }
}

