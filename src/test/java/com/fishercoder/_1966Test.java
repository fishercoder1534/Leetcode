package com.fishercoder;

import com.fishercoder.solutions._1966;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1966Test {
    private static _1966.Solution1 solution1;
    private static _1966.Solution2 solution2;
    private static _1966.Solution3 solution3;
    private static int[] nums;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1966.Solution1();
        solution2 = new _1966.Solution2();
        solution3 = new _1966.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{7};
        expected = 1;
        assertEquals(expected, solution1.binarySearchableNumbers(nums));
        assertEquals(expected, solution2.binarySearchableNumbers(nums));
        assertEquals(expected, solution3.binarySearchableNumbers(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{-1, 5, 2};
        expected = 1;
        assertEquals(expected, solution1.binarySearchableNumbers(nums));
        assertEquals(expected, solution2.binarySearchableNumbers(nums));
        assertEquals(expected, solution3.binarySearchableNumbers(nums));
    }

    @Test
    public void test3() {
        /**This is to answer the follow-up question, what if duplicates are allowed in the input*/
        nums = new int[]{-1, -1, 5, 2};
        expected = 2;
        assertEquals(expected, solution1.binarySearchableNumbers(nums));
        assertEquals(expected, solution2.binarySearchableNumbers(nums));
        assertEquals(expected, solution3.binarySearchableNumbers(nums));
    }

    @Test
    public void test4() {
        /**This is to answer the follow-up question, what if duplicates are allowed in the input*/
        nums = new int[]{-1, -1, 5, 2, 2, 5};
        expected = 3;
        assertEquals(expected, solution1.binarySearchableNumbers(nums));
        assertEquals(expected, solution2.binarySearchableNumbers(nums));
        assertEquals(expected, solution3.binarySearchableNumbers(nums));
    }
}
