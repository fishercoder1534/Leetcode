package com.fishercoder;

import com.fishercoder.solutions._1730;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1730Test {
    private static _1730.Solution1 test;

    @BeforeEach
    public void setup() {
        test = new _1730.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, test.getFood(new char[][]{
                {'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', '*', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'O', '#', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X'},
        }));
    }

    @Test
    public void test2() {
        assertEquals(-1, test.getFood(new char[][]{
                {'X', 'X', 'X', 'X', 'X'},
                {'X', '*', 'X', 'O', 'X'},
                {'X', 'O', 'X', '#', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        }));
    }

}
