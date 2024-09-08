package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._447;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _447Test {
    private _447.Solution1 solution1;
    private static int[][] points;

    @BeforeEach
    public void setup() {
        solution1 = new _447.Solution1();
    }

    @Test
    public void test1() {
        points =
                new int[][] {
                    {0, 0},
                    {1, 0},
                    {2, 0},
                };
        assertEquals(2, solution1.numberOfBoomerangs(points));
    }

    @Test
    public void test2() {
        points =
                new int[][] {
                    {3, 6},
                    {7, 5},
                    {3, 5},
                    {6, 2},
                    {9, 1},
                    {2, 7},
                    {0, 9},
                    {0, 6},
                    {2, 6}
                };
        assertEquals(10, solution1.numberOfBoomerangs(points));
    }
}
