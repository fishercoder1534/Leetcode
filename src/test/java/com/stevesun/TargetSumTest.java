package com.stevesun;

import com.stevesun.solutions.TargetSum;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TargetSumTest {
    private static TargetSum test;
    private static int expected;
    private static int actual;
    private static int S;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new TargetSum();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
        nums = new int[1000];
    }

    @Test
    public void test1(){
        S = 3;
        nums = new int[]{1, 1, 1, 1, 1};
        expected = 5;
        actual = test.findTargetSumWays(nums, S);
        assertEquals(expected, actual);
    }
}
