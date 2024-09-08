package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1024;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1024Test {
    private _1024.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1024.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                3,
                solution1.videoStitching(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]"),
                        10));
    }

    @Test
    public void test2() {
        assertEquals(
                -1,
                solution1.videoStitching(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,1],[1,2]"),
                        5));
    }

    @Test
    public void test3() {
        assertEquals(
                -1,
                solution1.videoStitching(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,2],[4,8]"),
                        5));
    }
}
