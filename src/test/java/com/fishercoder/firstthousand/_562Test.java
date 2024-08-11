package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._562;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 4/23/17.
 */
public class _562Test {
    private _562.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[][] M;

    @BeforeEach
    public void setup() {
        solution1 = new _562.Solution1();
    }

    @Test
    public void test1() {
        M = new int[][]{
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1}
        };
        expected = 3;
        actual = solution1.longestLine(M);
        assertEquals(expected, actual);
    }

}
