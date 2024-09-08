package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._743;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _743Test {
    private _743.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _743.Solution1();
    }

    @Test
    public void test1() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(solution1.networkDelayTime(times, 4, 2), 2);
    }

    @Test
    public void test2() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(solution1.networkDelayTime(times, 4, 3), -1);
    }
}
