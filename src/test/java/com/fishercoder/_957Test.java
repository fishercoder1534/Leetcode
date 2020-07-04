package com.fishercoder;

import com.fishercoder.solutions._957;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _957Test {
    private static _957.Solution1 solution1;
    private static int[] cells;

    @BeforeClass
    public static void setup() {
        solution1 = new _957.Solution1();
    }

    @Test
    public void test1() {
        cells = new int[]{0, 1, 0, 1, 1, 0, 0, 1};
        assertArrayEquals(new int[]{0, 0, 1, 1, 0, 0, 0, 0}, solution1.prisonAfterNDays(cells, 7));
    }

    @Test
    public void test2() {
        cells = new int[]{1, 0, 0, 1, 0, 0, 1, 0};
        assertArrayEquals(new int[]{0, 0, 1, 1, 1, 1, 1, 0}, solution1.prisonAfterNDays(cells, 1000000000));
    }

    @Test
    public void test3() {
        cells = new int[]{0, 1, 1, 1, 0, 0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, solution1.prisonAfterNDays(cells, 99));
    }

    @Test
    public void test4() {
        cells = new int[]{0, 1, 1, 1, 1, 1, 1, 0};
        assertArrayEquals(new int[]{0, 0, 1, 1, 1, 1, 0, 0}, solution1.prisonAfterNDays(cells, 99));
    }

}