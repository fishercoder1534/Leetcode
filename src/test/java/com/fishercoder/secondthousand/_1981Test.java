package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1981;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1981Test {
    private _1981.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1981.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                0,
                solution1.minimizeTheDifference(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,2,3],[4,5,6],[7,8,9]"),
                        13));
    }

    @Test
    public void test2() {
        assertEquals(
                94,
                solution1.minimizeTheDifference(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1],[2],[3]"),
                        100));
    }

    @Test
    public void test3() {
        assertEquals(
                1,
                solution1.minimizeTheDifference(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,2,9,8,7]"),
                        6));
    }
}
