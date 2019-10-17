package com.fishercoder;

import com.fishercoder.solutions._33;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _33Test {
    private static _33.Solution1 solution1;
    private static _33.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _33.Solution1();
        solution2 = new _33.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        assertEquals(3, solution1.search(nums, 7));
        assertEquals(3, solution2.search(nums, 7));
    }
}
