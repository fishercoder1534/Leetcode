package com.fishercoder;

import com.fishercoder.solutions._1464;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1464Test {
    private static _1464.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1464.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 4, 5, 2};
        assertEquals(12, solution1.maxProduct(nums));
    }

}