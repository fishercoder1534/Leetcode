package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2500;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2500Test {
    private _2500.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2500.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.deleteGreatestValue(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,4],[3,3,1]")));
    }


}