package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._930;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _930Test {
    private _930.Solution1 solution1;
    private _930.Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution1 = new _930.Solution1();
        solution2 = new _930.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
        assertEquals(4, solution2.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }

    @Test
    public void test2() {
        assertEquals(15, solution1.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0));
    }
}
