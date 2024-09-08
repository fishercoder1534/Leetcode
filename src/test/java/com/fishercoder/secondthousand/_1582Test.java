package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1582;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1582Test {
    private _1582.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1582.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                3,
                solution1.numSpecial(
                        new int[][] {
                            {0, 0, 0, 0, 0},
                            {1, 0, 0, 0, 0},
                            {0, 1, 0, 0, 0},
                            {0, 0, 1, 0, 0},
                            {0, 0, 0, 1, 1}
                        }));
    }

    @Test
    public void test2() {
        assertEquals(
                2,
                solution1.numSpecial(
                        new int[][] {
                            {0, 0, 0, 1},
                            {1, 0, 0, 0},
                            {0, 1, 1, 0},
                            {0, 0, 0, 0}
                        }));
    }

    @Test
    public void test3() {
        assertEquals(
                3,
                solution1.numSpecial(
                        new int[][] {
                            {1, 0, 0},
                            {0, 1, 0},
                            {0, 0, 1}
                        }));
    }

    @Test
    public void test4() {
        assertEquals(
                1,
                solution1.numSpecial(
                        new int[][] {
                            {1, 0, 0},
                            {0, 0, 1},
                            {1, 0, 0}
                        }));
    }
}
