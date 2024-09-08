package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._217;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _217Test {
    private _217.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _217.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 2, 3, 4, 3};
        assertEquals(true, solution1.containsDuplicate(nums));
    }
}
