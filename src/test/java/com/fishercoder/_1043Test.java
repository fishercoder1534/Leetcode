package com.fishercoder;

import com.fishercoder.solutions._1043;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1043Test {
    private static _1043.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1043.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(84, solution1.maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
    }

}