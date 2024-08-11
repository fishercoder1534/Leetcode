package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1437;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1437Test {
    private _1437.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1437.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        assertEquals(true, solution1.kLengthApart(nums, 2));
    }

}