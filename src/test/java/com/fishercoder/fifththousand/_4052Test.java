package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.fifththousand._4052;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4052Test {
    private _4052.Solution1 solution1;
    private _4052.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _4052.Solution1();
        solution2 = new _4052.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[][] {{2, 4}, {3, 1}},
                solution1.cyclicShift(
                        2, new int[][] {{1, 2}, {3, 4}}, new int[] {1, 0}, new int[] {0, 1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[][] {{2, 4}, {3, 1}},
                solution2.cyclicShift(
                        2, new int[][] {{1, 2}, {3, 4}}, new int[] {1, 0}, new int[] {0, 1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(
                new int[][] {{7, 8, 5}, {2, 3, 9}, {6, 4, 1}},
                solution1.cyclicShift(
                        3,
                        new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        new int[] {1, 2, 0},
                        new int[] {2, 2, 1}));
    }
}
