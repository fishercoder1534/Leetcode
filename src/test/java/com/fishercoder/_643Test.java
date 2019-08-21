package com.fishercoder;

import com.fishercoder.solutions._643;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _643Test {
    private static _643.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _643.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 12, -5, -6, 50, 3};
        assertEquals(12.75, solution1.findMaxAverage(nums, 4), 0.01);
    }

    @Test
    public void test2() {
        nums = new int[]{-1};
        assertEquals(-1.0, solution1.findMaxAverage(nums, 1), 0.01);
    }

    @Test
    public void test3() {
        nums = new int[]{-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284, -3024, 1714, -2825, -2374, -2750, -959, 6516, 9356, 8040, -2169, -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293, -3486, -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576, -1501, -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636, -3994, -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880, 4127, -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591, 9076, 942, 4571, -4200, 7271, -6920, -1886, 662, 7844, 3658, -6562, -2106, -296, -3280, 8909, -8352, -9413, 3513, 1352, -8825};
        assertEquals(37.25555555555555, solution1.findMaxAverage(nums, 90), 0.01);
    }
}
