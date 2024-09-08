package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.firstthousand._688;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _688Test {
    private _688.Solution1 solution1;
    private _688.Solution2 solution2;

    @BeforeEach
    public void setupForEachTest() {
        solution1 = new _688.Solution1();
        solution2 = new _688.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(0.0625, solution1.knightProbability(3, 2, 0, 0));
        assertEquals(0.0625, solution2.knightProbability(3, 2, 0, 0));
    }

    @Test
    public void test2() {
        assertTrue(Math.abs(0.00019 - solution2.knightProbability(8, 30, 6, 4)) < 10e-7);
    }
}
