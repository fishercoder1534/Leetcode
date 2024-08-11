package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1886;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1886Test {
    private _1886.Solution1 solution1;

    @BeforeEach
    public void setup() {
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