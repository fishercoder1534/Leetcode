package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._553;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 5/25/17.
 */
public class _553Test {
    private _553.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _553.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1000, 100, 10, 2};
        assertEquals("1000/(100/10/2)", solution1.optimalDivision(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1000, 100, 40, 10, 2};
        assertEquals("1000/(100/40/10/2)", solution1.optimalDivision(nums));
    }
}
