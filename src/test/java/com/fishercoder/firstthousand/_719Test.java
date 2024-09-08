package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._719;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _719Test {
    private _719.Solution1 solution1;
    private _719.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _719.Solution1();
        solution2 = new _719.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 3, 1};
        assertEquals(0, solution1.smallestDistancePair(nums, 1));
        assertEquals(0, solution2.smallestDistancePair(nums, 1));
    }
}
