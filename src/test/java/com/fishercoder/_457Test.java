package com.fishercoder;

import com.fishercoder.solutions._457;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _457Test {
    private static _457.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _457.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, -1, 1, 2, 2};
        assertEquals(true, solution1.circularArrayLoop(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{-1, 2};
        assertEquals(false, solution1.circularArrayLoop(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{-1, 2, 3};
        assertEquals(false, solution1.circularArrayLoop(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{2, 1, 9};
        assertEquals(false, solution1.circularArrayLoop(nums));
    }

}