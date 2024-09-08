package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._130;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _130Test {
    private _130.Solution1 solution1;
    private _130.Solution2 solution2;
    private char[][] board;
    private char[][] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _130.Solution1();
        solution2 = new _130.Solution2();
    }

    @Test
    public void test1() {
        board =
                CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"],"
                                + "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"X\",\"O\",\"X\",\"O\"],"
                                + "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        expected =
                CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"],"
                                + "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"],"
                                + "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        solution1.solve(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void test2() {
        board =
                CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"],"
                                + "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"X\",\"O\",\"X\",\"O\"],"
                                + "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        expected =
                CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"X\",\"O\",\"X\",\"O\",\"X\",\"O\",\"O\",\"O\",\"X\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"X\",\"O\",\"O\",\"X\"],"
                                + "[\"O\",\"O\",\"X\",\"X\",\"O\",\"X\",\"X\",\"O\",\"O\",\"O\"],[\"X\",\"O\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\"],[\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"],[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"X\",\"X\",\"X\",\"O\",\"X\",\"O\"],"
                                + "[\"X\",\"X\",\"O\",\"X\",\"X\",\"X\",\"X\",\"O\",\"O\",\"O\"]");
        CommonUtils.print2DCharArray(board);
        solution2.solve(board);
        CommonUtils.print2DCharArray(board);
        CommonUtils.print2DCharArray(expected);
        assertArrayEquals(expected, board);
    }
}
