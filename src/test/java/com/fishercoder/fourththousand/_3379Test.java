package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.fourththousand._3379;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3379Test {
    private _3379.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3379.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {1, 1, 1, 3},
                solution1.constructTransformedArray(new int[] {3, -2, 1, 1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[] {-1, -1, 4}, solution1.constructTransformedArray(new int[] {-1, 4, -1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {-10}, solution1.constructTransformedArray(new int[] {-10}));
    }
}
