package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._540;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _540Test {
    private _540.Solution1 solution1;
    private _540.Solution2 solution2;
    private _540.Solution3 solution3;
    private static int[] nums;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _540.Solution1();
        solution2 = new _540.Solution2();
        solution3 = new _540.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        expected = 2;
        assertEquals(expected, solution1.singleNonDuplicate(nums));
        assertEquals(expected, solution2.singleNonDuplicate(nums));
        assertEquals(expected, solution3.singleNonDuplicate(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        expected = 10;
        assertEquals(expected, solution1.singleNonDuplicate(nums));
        assertEquals(expected, solution2.singleNonDuplicate(nums));
        assertEquals(expected, solution3.singleNonDuplicate(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1, 2};
        expected = 2;
        assertEquals(expected, solution1.singleNonDuplicate(nums));
        assertEquals(expected, solution2.singleNonDuplicate(nums));
        assertEquals(expected, solution3.singleNonDuplicate(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{1, 1, 2, 2, 3};
        expected = 3;
        assertEquals(expected, solution1.singleNonDuplicate(nums));
        assertEquals(expected, solution2.singleNonDuplicate(nums));
        assertEquals(expected, solution3.singleNonDuplicate(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{1, 2, 2, 3, 3};
        expected = 1;
        assertEquals(expected, solution1.singleNonDuplicate(nums));
        assertEquals(expected, solution2.singleNonDuplicate(nums));
        assertEquals(expected, solution3.singleNonDuplicate(nums));
    }
}
