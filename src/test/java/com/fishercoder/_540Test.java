package com.fishercoder;

import com.fishercoder.solutions._540;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _540Test {
    private static _540.Solution1 solution1;
    private static _540.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _540.Solution1();
        solution2 = new _540.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        assertEquals(2, solution1.singleNonDuplicate(nums));
        assertEquals(2, solution2.singleNonDuplicate(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        assertEquals(10, solution1.singleNonDuplicate(nums));
        assertEquals(10, solution2.singleNonDuplicate(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1, 2};
        assertEquals(2, solution1.singleNonDuplicate(nums));
        assertEquals(2, solution2.singleNonDuplicate(nums));
    }
}
