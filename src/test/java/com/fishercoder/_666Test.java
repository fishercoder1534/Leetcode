package com.fishercoder;

import com.fishercoder.solutions._666;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _666Test {
    private static _666.Solution1 solution1;
    private static _666.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _666.Solution1();
        solution2 = new _666.Solution2();
    }

    @Before
    public void cleanUp() {
        solution1.totalSum = 0;
        solution2.totalSum = 0;
    }

    @Test
    public void test1() {
        nums = new int[]{113, 215, 221};
        assertEquals(12, solution1.pathSum(nums));
        assertEquals(12, solution2.pathSum(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{113, 221};
        assertEquals(4, solution1.pathSum(nums));
        assertEquals(4, solution2.pathSum(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{113, 214, 221, 348, 487};
        assertEquals(26, solution1.pathSum(nums));
        assertEquals(26, solution2.pathSum(nums));
    }

}
