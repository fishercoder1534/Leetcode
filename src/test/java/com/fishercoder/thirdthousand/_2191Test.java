package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.thirdthousand._2191;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2191Test {
    private _2191.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2191.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {338, 38, 991},
                solution1.sortJumbled(
                        new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[] {991, 338, 38}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[] {0, 999999999},
                solution1.sortJumbled(
                        new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[] {0, 999999999}));
    }
}
