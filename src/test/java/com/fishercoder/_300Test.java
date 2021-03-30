package com.fishercoder;

import com.fishercoder.solutions._300;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _300Test {

    private static _300.Solution1 solution1;
    private static _300.Solution2 solution2;
    private static _300.Solution3 solution3;
    private static _300.Solution4 solution4;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _300.Solution1();
        solution2 = new _300.Solution2();
        solution3 = new _300.Solution3();
        solution4 = new _300.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, solution1.lengthOfLIS(nums));
        assertEquals(4, solution2.lengthOfLIS(nums));
        assertEquals(4, solution3.lengthOfLIS(nums));
        assertEquals(4, solution4.lengthOfLIS(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{0, 1, 0, 3, 2, 3};
        assertEquals(4, solution1.lengthOfLIS(nums));
        assertEquals(4, solution2.lengthOfLIS(nums));
        assertEquals(4, solution3.lengthOfLIS(nums));
        assertEquals(4, solution4.lengthOfLIS(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, solution1.lengthOfLIS(nums));
        assertEquals(1, solution2.lengthOfLIS(nums));
        assertEquals(1, solution3.lengthOfLIS(nums));
        assertEquals(1, solution3.lengthOfLIS(nums));
    }

}