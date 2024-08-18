package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2190;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2190Test {
    private _2190.Solution1 solution1;
    private static int[] nums;
    private static int key;

    @BeforeEach
    public void setup() {
        solution1 = new _2190.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 2, 2, 2, 3};
        key = 2;
        assertEquals(2, solution1.mostFrequent(nums, key));
    }
}
