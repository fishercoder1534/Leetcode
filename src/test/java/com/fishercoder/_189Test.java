package com.fishercoder;

import com.fishercoder.solutions._189;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _189Test {
    private static _189.Solution1 solution1;
    private static _189.Solution2 solution2;
    private static _189.Solution3 solution3;
    private static _189.Solution4 solution4;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _189.Solution1();
        solution2 = new _189.Solution2();
        solution3 = new _189.Solution3();
        solution4 = new _189.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        solution1.rotate(nums, 1);
        assertArrayEquals(new int[]{3, 1, 2}, nums);
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 3};
        solution2.rotate(nums, 1);
        assertArrayEquals(new int[]{3, 1, 2}, nums);
    }

    @Test
    public void test3() {
        nums = new int[]{1, 2, 3};
        solution3.rotate(nums, 1);
        assertArrayEquals(new int[]{3, 1, 2}, nums);
    }

    @Test
    public void test4() {
        nums = new int[]{1, 2, 3};
        solution4.rotate(nums, 1);
        assertArrayEquals(new int[]{3, 1, 2}, nums);
    }

    @Test
    public void test5() {
        nums = new int[]{-1, -100, 3, 99};
        solution4.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

}
