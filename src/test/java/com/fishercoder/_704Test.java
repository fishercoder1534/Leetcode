package com.fishercoder;

import com.fishercoder.solutions._704;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _704Test {
    private static _704.Solution1 solution1;
    private static _704.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _704.Solution1();
        solution2 = new _704.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{-1, 0, 3, 5, 9, 12};
        assertEquals(4, solution1.search(nums, 9));
    }

    @Test
    public void test2() {
        nums = new int[]{-1, 0, 3, 5, 9, 12};
        assertEquals(-1, solution1.search(nums, 2));
    }

    @Test
    public void test3() {
        nums = new int[]{5};
        assertEquals(0, solution1.search(nums, 5));
        assertEquals(0, solution2.search(nums, 5));
    }

    @Test
    public void test4() {
        nums = new int[]{-1, 0};
        assertEquals(1, solution1.search(nums, 0));
    }

    @Test
    public void test5() {
        nums = new int[]{-1, 0, 3, 5, 9, 12};
        assertEquals(1, solution1.search(nums, 0));
    }

    @Test
    public void test6() {
        nums = new int[]{2, 5};
        assertEquals(-1, solution2.search(nums, 0));
    }
}
