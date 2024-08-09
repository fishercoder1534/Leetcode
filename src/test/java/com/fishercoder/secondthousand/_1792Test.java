package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1792;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1792Test {
    private _1792.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1792.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0.78333, solution1.maxAverageRatio(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[3,5],[2,2]"), 2), 0.00001);
    }

}