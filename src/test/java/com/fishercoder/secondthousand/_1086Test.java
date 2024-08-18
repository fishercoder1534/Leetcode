package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1086;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1086Test {
    private _1086.Solution1 solution1;
    private _1086.Solution2 solution2;
    private static int[][] items;

    @BeforeEach
    public void setup() {
        solution1 = new _1086.Solution1();
        solution2 = new _1086.Solution2();
    }

    @Test
    public void test1() {
        items =
                new int[][] {
                    {1, 91},
                    {1, 92},
                    {2, 93},
                    {2, 97},
                    {1, 60},
                    {2, 77},
                    {1, 65},
                    {1, 87},
                    {1, 100},
                    {2, 100},
                    {2, 76}
                };
        assertArrayEquals(
                new int[][] {
                    {1, 87},
                    {2, 88}
                },
                solution1.highFive(items));
    }

    @Test
    public void test2() {
        items =
                new int[][] {
                    {1, 91},
                    {1, 92},
                    {2, 93},
                    {2, 97},
                    {1, 60},
                    {2, 77},
                    {1, 65},
                    {1, 87},
                    {1, 100},
                    {2, 100},
                    {2, 76}
                };
        assertArrayEquals(
                new int[][] {
                    {1, 87},
                    {2, 88}
                },
                solution2.highFive(items));
    }
}
