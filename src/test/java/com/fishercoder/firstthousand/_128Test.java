package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._128;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _128Test {
    private _128.Solution3 solution3;
    private _128.Solution4 solution4;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution3 = new _128.Solution3();
        solution4 = new _128.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[] {100, 4, 200, 1, 3, 2};
        assertEquals(4, solution3.longestConsecutive(nums));
        assertEquals(4, solution4.longestConsecutive(nums));
    }
}
