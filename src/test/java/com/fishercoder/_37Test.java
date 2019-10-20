package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._37;
import org.junit.BeforeClass;
import org.junit.Test;

public class _37Test {
    private static _37.Solution1 solution1;
    private static char[][] board;

    @BeforeClass
    public static void setup() {
        solution1 = new _37.Solution1();
    }

    @Test
    public void test1() {
        board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '3', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '7', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        CommonUtils.print2DCharArray(board);
        solution1.solveSudoku(board);
        CommonUtils.print2DCharArray(board);
    }
}
