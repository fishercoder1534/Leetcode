package com.fishercoder;

import com.fishercoder.solutions._1886;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1886Test {
    private static _1886.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1886.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.findRotation(new int[][]{
                {0, 1},
                {1, 0}
        }, new int[][]{
                {1, 0},
                {0, 1}
        }));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.findRotation(new int[][]{
                {0, 1},
                {1, 1}
        }, new int[][]{
                {1, 0},
                {0, 1}
        }));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.findRotation(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        }, new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        }));
    }

}