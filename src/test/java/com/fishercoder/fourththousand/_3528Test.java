package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3528;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3528Test {
    private _3528.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3528.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 6}, solution1.baseUnitConversions(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,2],[1,2,3]")));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 1000000000, 49},
                solution1.baseUnitConversions(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,1000000000],[1,2,1000000000]")))
        ;
    }

}
