package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._665;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _665Test {
    private _665.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _665.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 2, 3};
        assertEquals(true, solution1.checkPossibility(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{4, 2, 1};
        assertEquals(false, solution1.checkPossibility(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{3, 4, 2, 3};
        assertEquals(false, solution1.checkPossibility(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{2, 3, 3, 2, 4};
        assertEquals(true, solution1.checkPossibility(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{2, 3, 3, 2, 2, 4};
        assertEquals(false, solution1.checkPossibility(nums));
    }

    @Test
    public void test6() {
        nums = new int[]{2, 3, 3, 2, 2, 2, 4};
        assertEquals(false, solution1.checkPossibility(nums));
    }

    @Test
    public void test7() {
        nums = new int[]{3, 3, 2, 2};
        assertEquals(false, solution1.checkPossibility(nums));
    }

    @Test
    public void test8() {
        nums = new int[]{-1, 4, 2, 3};
        assertEquals(true, solution1.checkPossibility(nums));
    }

    @Test
    public void test9() {
        nums = new int[]{1, 2, 4, 5, 3};
        assertEquals(true, solution1.checkPossibility(nums));
    }

    @Test
    public void test10() {
        nums = new int[]{1, 2, 4, 5, 3, 6};
        assertEquals(true, solution1.checkPossibility(nums));
    }

}