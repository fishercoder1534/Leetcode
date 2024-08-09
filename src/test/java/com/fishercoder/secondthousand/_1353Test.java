package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1353;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1353Test {
    private _1353.Solution1 solution1;
    private static int[][] events;

    @BeforeEach
    public void setup() {
        solution1 = new _1353.Solution1();
    }

    @Test
    public void test1() {
        events = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        };
        assertEquals(3, solution1.maxEvents(events));
    }

    @Test
    public void test2() {
        events = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 2}
        };
        assertEquals(4, solution1.maxEvents(events));
    }

    @Test
    public void test3() {
        events = new int[][]{
                {1, 4},
                {4, 4},
                {2, 2},
                {3, 4},
                {1, 1}
        };
        assertEquals(4, solution1.maxEvents(events));
    }

    @Test
    public void test4() {
        events = new int[][]{
                {1, 100000}
        };
        assertEquals(1, solution1.maxEvents(events));
    }

    @Test
    public void test5() {
        events = new int[][]{
                {1, 1},
                {1, 2},
                {1, 3},
                {1, 4},
                {1, 5},
                {1, 6},
                {1, 7},
        };
        assertEquals(7, solution1.maxEvents(events));
    }

}