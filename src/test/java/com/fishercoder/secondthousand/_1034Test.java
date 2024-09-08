package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1034;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1034Test {
    private _1034.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1034.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray("[3,3],[3,2]"),
                solution1.colorBorder(
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[1,1],[1,2]"),
                        0,
                        0,
                        3));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                        "[1,2,1],[1,2,2],[2,2,1]"),
                solution1.colorBorder(
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[1,2,1],[1,2,2],[2,2,1]"),
                        1,
                        1,
                        2));
    }

    @Test
    public void test3() {
        assertArrayEquals(
                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                        "[1,1,1,1,1,2],[1,2,1,1,1,2],[1,1,1,1,1,2]"),
                solution1.colorBorder(
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[1,2,1,2,1,2],[2,2,2,2,1,2],[1,2,2,2,1,2]"),
                        1,
                        3,
                        1));
    }
}
