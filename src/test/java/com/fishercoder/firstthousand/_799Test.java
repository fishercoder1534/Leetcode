package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._799;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _799Test {
    private _799.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _799.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0.125, solution1.champagneTower(8, 3, 0), 0);
    }

    @Test
    public void test2() {
        assertEquals(0.875, solution1.champagneTower(8, 3, 1), 0);
    }

    @Test
    public void test3() {
        assertEquals(0.875, solution1.champagneTower(8, 3, 2), 0);
    }

    @Test
    public void test4() {
        assertEquals(0.125, solution1.champagneTower(8, 3, 3), 0);
    }

    @Test
    public void test5() {
        assertEquals(0.0, solution1.champagneTower(1, 1, 1), 0);
    }

    @Test
    public void test6() {
        assertEquals(0.5, solution1.champagneTower(2, 1, 1), 0);
    }

    @Test
    public void test7() {
        assertEquals(0.0, solution1.champagneTower(1000000000, 99, 99), 0);
    }
}
