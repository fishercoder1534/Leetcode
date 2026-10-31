package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3558;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3558Test {
    private _3558.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3558.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.assignEdgeWeights(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2]")));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.assignEdgeWeights(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[1,3],[3,4],[3,5]")));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.assignEdgeWeights(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[2,3],[3,4]")));
    }

}
