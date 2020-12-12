package com.fishercoder;

import com.fishercoder.solutions._1685;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1685Test {
    private static _1685.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1685.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 3, 5};
        assertArrayEquals(new int[]{4, 3, 5}, solution1.getSumAbsoluteDifferences(nums));
    }

}