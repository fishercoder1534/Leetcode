package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._861;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _861Test {
    private _861.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _861.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                39,
                solution1.matrixScore(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,0,1,1],[1,0,1,0],[1,1,0,0]")));
    }
}
