package com.fishercoder.solutions;
import java.util.*;
/**Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


 A partially filled sudoku which is valid.

 Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.*/
public class _36 {

    // this is my original solution, pretty straightforward, but lengthy, there's a very concise
    // version: https://discuss.leetcode.com/topic/9748/shared-my-concise-java-code, it uses
    //three HashSets in each loop, pretty cool!
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i))
                return false;
        }

        for (int j = 0; j < 9; j++) {
            if (!isValidCol(board, j))
                return false;
        }

        for (int i = 0; i < 7; i = i + 3) {
            for (int j = 0; j < 7; j = j + 3) {
                if (!isValidSquare(board, i, j))
                    return false;
            }
        }
        return true;
    }

    boolean isValidRow(char[][] board, int row) {
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = 1;
        }
        for (int j = 0; j < 9; j++) {
            if (board[row][j] != '.')
                nums[Character.getNumericValue(board[row][j]) - 1]--;
        }
        for (int i : nums) {
            if (i < 0)
                return false;
        }
        return true;
    }

    boolean isValidCol(char[][] board, int col) {
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = 1;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.')
                nums[Character.getNumericValue(board[i][col]) - 1]--;
        }
        for (int i : nums) {
            if (i < 0)
                return false;
        }
        return true;
    }

    boolean isValidSquare(char[][] board, int row, int col) {
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = 1;
        }
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.')
                    nums[Character.getNumericValue(board[i][j]) - 1]--;
            }
        }
        for (int i : nums) {
            if (i < 0)
                return false;
        }
        return true;
    }

    // the 3sets version
    public boolean isValidSudoku1(char[][] board) {
        for(int i = 0; i < 9; i++) {
        Set<Character> rows = new HashSet<>();
        Set<Character> cols = new HashSet<>();
        Set<Character> cube = new HashSet<>();
        for (int j = 0;j < 9; j++) {
            if(board[i][j] != '.' && ! rows.add(board[i][j])) return false;
            if(board[j][i] != '.' && ! cols.add(board[j][i])) return false;
            if(board[3*(i/3) + j/3][3*(i%3) + j % 3] != '.' && !cube.add(board[3*(i/3) + j/3][3*(i%3) + j % 3] )) return false;
        }
    }
        return true;
}

    public static void main(String... strings) {
        _36 test = new _36();
        // char[][] board = new char[][]{
        // {'4', '3', '5', '2', '6', '9', '7', '8', '1'},
        // {'6', '8', '2', '5', '7', '1', '4', '9', '3'},
        // {'1', '9', '7', '8', '3', '4', '5', '6', '2'},
        // {'8', '2', '6', '1', '9', '5', '3', '4', '7'},
        // {'3', '7', '4', '6', '8', '2', '9', '1', '5'},
        // {'9', '5', '1', '7', '4', '3', '6', '2', '8'},
        // {'5', '1', '9', '3', '2', '6', '8', '7', '4'},
        // {'2', '4', '8', '9', '5', '7', '1', '3', '6'},
        // {'7', '6', '3', '4', '1', '8', '2', '5', '9'},
        // };

        // char[][] board = new char[][]{
        // {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
        // {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
        // {'9', '.', '.', '.', '.', '.', '.', '.', '.'},
        // };

        char[][] board = new char[][] {
                { '.', '.', '.', '.', '5', '.', '.', '1', '.' },// this upper right corner 3*3
                                                                // square is invalid, '1' appears
                                                                // twice
                { '.', '4', '.', '3', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
                { '8', '.', '.', '.', '.', '.', '.', '2', '.' },
                { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
                { '.', '1', '5', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
                { '.', '2', '.', '9', '.', '.', '.', '.', '.' },
                { '.', '.', '4', '.', '.', '.', '.', '.', '.' }, };

        // ["....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"]

        System.out.println(test.isValidSudoku(board));
        System.out.println(test.isValidSudoku1(board));
    }
}
