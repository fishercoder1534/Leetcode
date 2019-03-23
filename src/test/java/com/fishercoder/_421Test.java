package com.fishercoder;

import com.fishercoder.solutions._421;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _421Test {
    private static _421.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _421.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 10, 5, 25, 2, 8};
        expected = 28;
        actual = solution1.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }
}
