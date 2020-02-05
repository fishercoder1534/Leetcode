package com.fishercoder;

import com.fishercoder.solutions._1275;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1275Test {
    private static _1275.Solution1 solution1;
    private static int[][] moves;

    @BeforeClass
    public static void setup() {
        solution1 = new _1275.Solution1();
    }

    @Before
    public void clear() {
        solution1 = new _1275.Solution1();
    }

    @Test
    public void test1() {
        moves = new int[][]{
                {0, 0},
                {2, 0},
                {1, 1},
                {2, 1},
                {2, 2},
        };
        assertEquals("A", solution1.tictactoe(moves));
    }

    @Test
    public void test2() {
        moves = new int[][]{
                {0, 0},
                {1, 1},
                {0, 1},
                {0, 2},
                {1, 0},
                {2, 0},
        };
        assertEquals("B", solution1.tictactoe(moves));
    }

    @Test
    public void test3() {
        moves = new int[][]{
                {0, 0},
                {1, 1},
                {2, 0},
                {1, 0},
                {1, 2},
                {2, 1},
                {0, 1},
                {0, 2},
                {2, 2},
        };
        assertEquals("Draw", solution1.tictactoe(moves));
    }

    @Test
    public void test4() {
        moves = new int[][]{
                {0, 0},
                {1, 1},
        };
        assertEquals("Pending", solution1.tictactoe(moves));
    }
}
