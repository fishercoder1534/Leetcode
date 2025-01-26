package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3386;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3386Test {
    private _3386.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3386.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                1,
                solution1.buttonWithLongestTime(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,2],[2,5],[3,9],[1,15]")));
    }

    @Test
    public void test2() {
        assertEquals(
                2,
                solution1.buttonWithLongestTime(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[9,4],[19,5],[2,8],[3,11],[2,15]")));
    }

    @Test
    public void test3() {
        assertEquals(
                2,
                solution1.buttonWithLongestTime(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[7,1],[19,3],[9,4],[12,5],[2,8],[15,10],[18,12],[7,14],[19,16]")));
    }

    @Test
    public void test4() {
        assertEquals(
                16,
                solution1.buttonWithLongestTime(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[5,5],[16,17],[16,19]")));
    }
}
