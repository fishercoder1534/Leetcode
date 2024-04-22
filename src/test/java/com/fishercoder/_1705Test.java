package com.fishercoder;

import com.fishercoder.solutions._1705;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1705Test {
    private static _1705.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1705.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.eatenApples(new int[]{1, 2, 3, 5, 2}, new int[]{3, 2, 1, 4, 2}));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.eatenApples(new int[]{3, 0, 0, 0, 0, 2}, new int[]{3, 0, 0, 0, 0, 2}));
    }

    @Test
    public void test3() {
        assertEquals(5, solution1.eatenApples(new int[]{9, 2}, new int[]{3, 5}));
    }

    @Test
    public void test4() {
        assertEquals(8, solution1.eatenApples(new int[]{2, 1, 1, 4, 5}, new int[]{10, 10, 6, 4, 2}));
    }

}
