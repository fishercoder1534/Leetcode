package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1762;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1762Test {
    private _1762.Solution1 solution1;
    private static int[] heights;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1762.Solution1();
    }

    @Test
    public void test1() {
        heights = new int[] {4, 2, 3, 1};
        expected = new int[] {0, 2, 3};
        assertArrayEquals(expected, solution1.findBuildings(heights));
    }
}
