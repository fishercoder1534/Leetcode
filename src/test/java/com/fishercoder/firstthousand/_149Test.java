package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._149;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _149Test {
    private _149.Solution1 solution1;
    private static int[][] points;

    @BeforeEach
    public void setup() {
        solution1 = new _149.Solution1();
    }

    @Test
    public void test1() {
        points = new int[][]{
                {1, 1},
                {2, 2},
                {3, 3}
        };
        assertEquals(3, solution1.maxPoints(points));
    }
}
