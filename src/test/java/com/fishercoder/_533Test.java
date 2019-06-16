package com.fishercoder;

import com.fishercoder.solutions._533;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _533Test {
    private static _533.Solution1 solution1;
    private static char[][] picture;

    @BeforeClass
    public static void setup() {
        solution1 = new _533.Solution1();
    }

    @Test
    public void test1() {
        picture = new char[][]{
                {'W', 'B', 'W', 'B', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'B', 'W'},
                {'W', 'W', 'B', 'W', 'B', 'W'}};
        assertEquals(6, solution1.findBlackPixel(picture, 3));
    }

    @Test
    public void test2() {
        picture = new char[][]{{'B'}};
        assertEquals(1, solution1.findBlackPixel(picture, 1));
    }
}
