package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1730;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1730Test {
    private _1730.Solution1 test;

    @BeforeEach
    public void setup() {
        test = new _1730.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                3,
                test.getFood(
                        new char[][] {
                            {'X', 'X', 'X', 'X', 'X', 'X'},
                            {'X', '*', 'O', 'O', 'O', 'X'},
                            {'X', 'O', 'O', '#', 'O', 'X'},
                            {'X', 'X', 'X', 'X', 'X', 'X'},
                        }));
    }

    @Test
    public void test2() {
        assertEquals(
                -1,
                test.getFood(
                        new char[][] {
                            {'X', 'X', 'X', 'X', 'X'},
                            {'X', '*', 'X', 'O', 'X'},
                            {'X', 'O', 'X', '#', 'X'},
                            {'X', 'X', 'X', 'X', 'X'},
                        }));
    }
}
