package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._851;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _851Test {
    private _851.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _851.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {5, 5, 2, 5, 4, 5, 6, 7},
                solution1.loudAndRich(
                        new int[][] {{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}},
                        new int[] {3, 2, 5, 4, 6, 1, 7, 0}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] {0}, solution1.loudAndRich(new int[][] {{}}, new int[] {0}));
    }

    @Test
    public void test3() {
        assertArrayEquals(
                new int[] {0, 1}, solution1.loudAndRich(new int[][] {{}}, new int[] {0, 1}));
    }

    @Test
    public void test4() {
        assertArrayEquals(
                new int[] {0, 1}, solution1.loudAndRich(new int[][] {{}}, new int[] {1, 0}));
    }

    @Test
    public void test5() {
        assertArrayEquals(
                new int[] {0, 1, 0},
                solution1.loudAndRich(new int[][] {{0, 2}, {1, 2}}, new int[] {0, 1, 2}));
    }
}
