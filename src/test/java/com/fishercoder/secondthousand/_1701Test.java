package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1701;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1701Test {
    private _1701.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _1701.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5.0, solution1.averageWaitingTime(new int[][] {{1, 2}, {2, 5}, {4, 3}}));
    }

    @Test
    public void test2() {
        assertEquals(
                3.25, solution1.averageWaitingTime(new int[][] {{5, 2}, {5, 4}, {10, 3}, {20, 1}}));
    }
}
