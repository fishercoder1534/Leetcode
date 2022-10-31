package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._283;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _283Test {
    private static _283.Solution1 solution1;
    private static _283.Solution2 solution2;
    private static _283.Solution3 solution3;
    private static _283.Solution4 solution4;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _283.Solution1();
        solution2 = new _283.Solution2();
        solution3 = new _283.Solution3();
        solution4 = new _283.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 1, 0, 3, 12};
        solution1.moveZeroes(nums);
        CommonUtils.printArray(nums);
    }

    @Test
    public void test2() {
        nums = new int[]{0, 1, 0, 3, 12};
        solution2.moveZeroes(nums);
        CommonUtils.printArray(nums);
    }

    @Test
    public void test3() {
        nums = new int[]{0, 1, 0, 3, 12};
        solution3.moveZeroes(nums);
        CommonUtils.printArray(nums);
    }

    @Test
    public void test4() {
        nums = new int[]{1, 0};
        solution1.moveZeroes(nums);
        CommonUtils.printArray(nums);
    }

    @Test
    public void test5() {
        nums = new int[]{0, 1, 0, 3, 12};
        solution1.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test6() {
        nums = new int[]{1, 0, 0};
        solution1.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    public void test7() {
        nums = new int[]{1, 0};
        solution2.moveZeroes(nums);
        CommonUtils.printArray(nums);
    }

    @Test
    public void test8() {
        nums = new int[]{0, 1, 0, 3, 12};
        solution2.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test9() {
        nums = new int[]{1, 0, 0};
        solution2.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    public void test10() {
        nums = new int[]{1, 0};
        solution3.moveZeroes(nums);
        CommonUtils.printArray(nums);
    }

    @Test
    public void test11() {
        nums = new int[]{0, 1, 0, 3, 12};
        solution3.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test12() {
        nums = new int[]{1, 0, 0};
        solution3.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    public void test13() {
        nums = new int[]{0};
        solution3.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void test14() {
        nums = new int[]{0, 0, 1};
        solution3.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    public void test15() {
        nums = new int[]{1, 0, 1};
        solution3.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 1, 0}, nums);
    }

    @Test
    public void test16() {
        nums = new int[]{2, 1};
        solution4.moveZeroes(nums);
        assertArrayEquals(new int[]{2, 1}, nums);
    }
}
