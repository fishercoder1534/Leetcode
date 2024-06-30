package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._934;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _934Test {
    private static _934.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _934.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.shortestBridge(new int[][]{
                {0, 1},
                {1, 0}
        }));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.shortestBridge(new int[][]{
                {0, 1, 0}, {0, 0, 0}, {0, 0, 1}
        }));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.shortestBridge(new int[][]{
                {1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}
        }));
    }

}