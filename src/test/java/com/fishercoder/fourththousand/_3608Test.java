package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3608;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3608Test {
    private _3608.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3608.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minTime(2, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,3]"), 2));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.minTime(3, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,2],[1,2,4]"), 3));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.minTime(3, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,2,5]"), 2));
    }

    @Test
    public void test4() {
        assertEquals(3513, solution1.minTime(3, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,0,7311],[2,1,3513],[0,2,2329]"), 2));
    }

}
