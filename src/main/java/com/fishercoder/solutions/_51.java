package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _51 {

    public static class Solution1 {

        public List<List<String>> solveNQueens(int n) {
            List<List<String>> result = new ArrayList<>();
            if (n <= 0) {
                return result;
            }
            search(n, new ArrayList<>(), result);
            return result;
        }

        private void search(int n, ArrayList<Integer> col, List<List<String>> result) {
            if (col.size() == n) {
                result.add(drawChessBoard(col));
                return;
            }

            for (int i = 0; i < n; i++) {
                if (!isValid(col, i)) {
                    continue;
                }
                col.add(i);
                search(n, col, result);
                col.remove(col.size() - 1);
            }
        }

        private boolean isValid(ArrayList<Integer> col, int next) {
            int row = col.size();
            for (int i = 0; i < row; i++) {
                if (next == col.get(i)) {
                    return false;
                }

                if (i - row == col.get(i) - next) {
                    return false;
                }

                if (i - row == next - col.get(i)) {
                    return false;
                }
            }
            return true;
        }

        private ArrayList<String> drawChessBoard(ArrayList<Integer> col) {
            ArrayList<String> chessBoard = new ArrayList<>();

            for (int i = 0; i < col.size(); i++) {
                String row = "";
                for (int j = 0; j < col.size(); j++) {
                    if (col.get(j) == i) {
                        row += "Q";
                    } else {
                        row += ".";
                    }
                }
                chessBoard.add(row);
            }
            return chessBoard;
        }
    }
}
