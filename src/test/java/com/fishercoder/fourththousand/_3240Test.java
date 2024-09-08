package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3240;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3240Test {
    private _3240.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3240.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                3,
                solution1.minFlips(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,0,0],[0,1,0],[0,0,1]")));
    }
}
