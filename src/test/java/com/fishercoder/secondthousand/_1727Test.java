package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1727;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1727Test {
    private _1727.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1727.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                8,
                solution1.largestSubmatrix(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,1,1,1,1,1,1],[1,1,0,1,1,0,1],[1,0,0,1,0,1,1]")));
    }
}
