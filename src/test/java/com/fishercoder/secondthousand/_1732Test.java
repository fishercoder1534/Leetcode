package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1732;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1732Test {
    private _1732.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1732.Solution1();
    }

    @Test
    public void test1() {
        nums =
                new int[] {
                    44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85,
                    -39, 67, -63, 64, -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81
                };
        assertEquals(781, solution1.largestAltitude(nums));
    }
}
