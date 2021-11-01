package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._130;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _130Test {
    private static _130.Solution1 solution1;
    private static _130.Solution2 solution2;
    private static char[][] board;
    private static char[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _130.Solution1();
        solution2 = new _130.Solution2();
    }

    @Test
    public void test1() {
        board = CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"]," +
                "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"X\",\"O\",\"X\",\"O\"]," +
                "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        expected = CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"]," +
                "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"]," +
                "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        solution1.solve(board);
        assertEquals(expected, board);
    }

    @Test
    public void test2() {
        board = CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"]," +
                "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"X\",\"O\",\"X\",\"O\"]," +
                "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        expected = CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"]," +
                "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"]," +
                "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        CommonUtils.print2DCharArray(board);
        solution2.solve(board);
        CommonUtils.print2DCharArray(board);
        CommonUtils.print2DCharArray(expected);
        assertEquals(expected, board);
    }

}