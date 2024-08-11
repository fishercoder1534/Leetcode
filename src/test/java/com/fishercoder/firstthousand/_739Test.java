package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._739;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _739Test {
    private _739.Solution1 solution1;
    private static int[] temperatures;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _739.Solution1();
    }

    @Test
    public void test1() {
        temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solution1.dailyTemperatures(temperatures));
    }

}