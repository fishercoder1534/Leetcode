package com.fishercoder;

import com.fishercoder.solutions._55;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _55Test {
    private static _55.Solution1 solution1;
    private static _55.Solution2 solution2;
    private static _55.Solution3 solution3;
    private static _55.Solution4 solution4;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _55.Solution1();
        solution2 = new _55.Solution2();
        solution3 = new _55.Solution3();
        solution4 = new _55.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 2, 3};
        assertEquals(false, solution1.canJump(nums));
        assertEquals(false, solution2.canJump(nums));
        assertEquals(false, solution3.canJump(nums));
        assertEquals(false, solution4.canJump(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2};
        assertEquals(true, solution1.canJump(nums));
        assertEquals(true, solution2.canJump(nums));
        assertEquals(true, solution3.canJump(nums));
        assertEquals(true, solution4.canJump(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(true, solution1.canJump(nums));
        assertEquals(true, solution2.canJump(nums));
        assertEquals(true, solution3.canJump(nums));
        assertEquals(true, solution4.canJump(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0};
        assertEquals(true, solution1.canJump(nums));
        assertEquals(true, solution2.canJump(nums));
        assertEquals(true, solution3.canJump(nums));
        assertEquals(true, solution4.canJump(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{2, 0, 0};
        assertEquals(true, solution1.canJump(nums));
        assertEquals(true, solution2.canJump(nums));
        assertEquals(true, solution3.canJump(nums));
        assertEquals(true, solution4.canJump(nums));
    }

    @Test
    public void test6() {
        nums = new int[]{2, 0};
        assertEquals(true, solution1.canJump(nums));
        assertEquals(true, solution2.canJump(nums));
        assertEquals(true, solution3.canJump(nums));
        assertEquals(true, solution4.canJump(nums));
    }

    @Test
    public void test7() {
        nums = new int[]{1, 1, 0, 1};
        assertEquals(false, solution1.canJump(nums));
        assertEquals(false, solution2.canJump(nums));
        assertEquals(false, solution3.canJump(nums));
        assertEquals(false, solution4.canJump(nums));
    }

    @Test
    public void test8() {
        nums = new int[]{0};
        assertEquals(true, solution1.canJump(nums));
        assertEquals(true, solution2.canJump(nums));
        assertEquals(true, solution3.canJump(nums));
        assertEquals(true, solution4.canJump(nums));
    }

    @Test
    public void test9() {
        nums = new int[]{3, 2, 1, 0, 4};
        assertEquals(false, solution1.canJump(nums));
        assertEquals(false, solution2.canJump(nums));
        assertEquals(false, solution3.canJump(nums));
        assertEquals(false, solution4.canJump(nums));
    }


}