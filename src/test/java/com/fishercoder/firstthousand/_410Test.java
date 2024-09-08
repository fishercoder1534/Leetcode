package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._410;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _410Test {
    private _410.Solution1 test;
    private static int[] nums;

    @BeforeEach
    public void setUp() {
        test = new _410.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {7, 2, 5, 10, 8};
        assertEquals(18, test.splitArray(nums, 2));
    }
}
