package com.fishercoder;

import com.fishercoder.solutions._220;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _220Test {
    private static _220.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _220.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-1, -1};
        assertEquals(true, solution1.containsNearbyAlmostDuplicate(nums, 1, 0));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2};
        assertEquals(false, solution1.containsNearbyAlmostDuplicate(nums, 0, 1));
    }

    @Test
    public void test3() {
        nums = new int[]{4, 2};
        assertEquals(false, solution1.containsNearbyAlmostDuplicate(nums, 2, 1));
    }

    @Test
    public void test4() {
        nums = new int[]{2, 2};
        assertEquals(true, solution1.containsNearbyAlmostDuplicate(nums, 3, 0));
    }

    @Test
    public void test5() {
        nums = new int[]{1};
        assertEquals(false, solution1.containsNearbyAlmostDuplicate(nums, 1, 1));
    }

    @Test
    public void test6() {
        nums = new int[]{2147483647, -2147483647};
        assertEquals(false, solution1.containsNearbyAlmostDuplicate(nums, 1, 2147483647));
    }

    @Test
    public void test7() {
        nums = new int[]{-1, 2147483647};
        assertEquals(false, solution1.containsNearbyAlmostDuplicate(nums, 1, 2147483647));
    }

}