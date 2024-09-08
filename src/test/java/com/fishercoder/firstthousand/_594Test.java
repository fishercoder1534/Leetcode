package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._594;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 5/20/17. */
public class _594Test {
    private _594.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _594.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 3, 2, 2, 5, 2, 3, 7};
        assertEquals(5, solution1.findLHS(nums));
    }
}
