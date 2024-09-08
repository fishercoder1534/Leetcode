package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1232;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1232Test {
    private _1232.Solution1 solution1;
    private static int[][] coordinates;

    @BeforeEach
    public void setup() {
        solution1 = new _1232.Solution1();
    }

    @Test
    public void test1() {
        coordinates =
                new int[][] {
                    {1, 2},
                    {2, 3},
                    {3, 4},
                    {4, 5},
                    {5, 6},
                    {6, 7}
                };
        assertEquals(true, solution1.checkStraightLine(coordinates));
    }

    @Test
    public void test2() {
        coordinates =
                new int[][] {
                    {1, 1},
                    {2, 2},
                    {3, 4},
                    {4, 5},
                    {5, 6},
                    {7, 7}
                };
        assertEquals(false, solution1.checkStraightLine(coordinates));
    }

    @Test
    public void test3() {
        coordinates =
                new int[][] {
                    {-3, -2},
                    {-1, -2},
                    {2, -2},
                    {-2, -2},
                    {0, -2}
                };
        assertEquals(true, solution1.checkStraightLine(coordinates));
    }

    @Test
    public void test4() {
        coordinates =
                new int[][] {
                    {0, 1},
                    {1, 3},
                    {-4, -7},
                    {5, 11}
                };
        assertEquals(true, solution1.checkStraightLine(coordinates));
    }
}
