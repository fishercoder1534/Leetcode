package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._852;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _852Test {
    private _852.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _852.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] {0, 1, 0};
        assertEquals(1, solution1.peakIndexInMountainArray(A));
    }

    @Test
    public void test2() {
        A = new int[] {0, 2, 1, 0};
        assertEquals(1, solution1.peakIndexInMountainArray(A));
    }
}
