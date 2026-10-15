package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3643;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3643Test {
    private _3643.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3643.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals((CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,3,4],[13,14,15,8],[9,10,11,12],[5,6,7,16]")), solution1.reverseSubmatrix(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]"), 1, 0, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals((CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[11,15,18,6],[19,19,4,15],[2,14,11,20],[14,3,18,16]")), solution1.reverseSubmatrix(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[14,3,18,16],[2,14,11,20],[19,19,4,15],[11,15,18,6]"), 0, 0, 4));
    }

}
