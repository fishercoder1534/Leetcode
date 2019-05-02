package com.fishercoder;

import com.fishercoder.solutions._1033;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1033Test {
    private static _1033.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1033.Solution1();
    }

    @Test
    public void test1() {
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution1.numMovesStones(1, 2, 5));
    }

    @Test
    public void test2() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution1.numMovesStones(4, 3, 2));
    }

    @Test
    public void test3() {
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution1.numMovesStones(3, 5, 1));
    }
}