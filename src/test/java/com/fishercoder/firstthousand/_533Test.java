package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._533;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _533Test {
    private _533.Solution1 solution1;
    private static char[][] picture;

    @BeforeEach
    public void setup() {
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
