package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3004;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3004Test {
    private _3004.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3004.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                1,
                solution1.maximumSubtreeSize(
                        new int[][] {{0, 1}, {0, 2}, {0, 3}}, new int[] {1, 1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(
                4,
                solution1.maximumSubtreeSize(
                        new int[][] {{0, 1}, {0, 2}, {0, 3}}, new int[] {1, 1, 1, 1}));
    }

    @Test
    public void test3() {
        assertEquals(
                3,
                solution1.maximumSubtreeSize(
                        new int[][] {{0, 1}, {0, 2}, {2, 3}, {2, 4}}, new int[] {1, 2, 3, 3, 3}));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.maximumSubtreeSize(new int[][] {{}}, new int[] {1}));
    }

    @Test
    public void test5() {
        assertEquals(
                1, solution1.maximumSubtreeSize(new int[][] {{0, 1}, {1, 2}}, new int[] {1, 1, 2}));
    }
}
