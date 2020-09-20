package com.fishercoder;

import com.fishercoder.solutions._1588;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1588Test {
    private static _1588.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1588.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(58, solution1.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }

}