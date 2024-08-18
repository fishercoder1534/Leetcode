package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._757;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _757Test {
    private _757.Solution solution;
    int[][] intervals;

    @BeforeEach
    public void setup() {
        solution = new _757.Solution();
    }

    @Test
    public void test1() {
        intervals = new int[][] {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        assertEquals(3, solution.intersectionSizeTwo(intervals));
    }

    @Test
    public void test2() {
        intervals =
                new int[][] {
                    {16, 18}, {11, 18}, {15, 23}, {1, 16}, {10, 16}, {6, 19}, {18, 20}, {7, 19}
                };
        assertEquals(4, solution.intersectionSizeTwo(intervals));
    }
}
