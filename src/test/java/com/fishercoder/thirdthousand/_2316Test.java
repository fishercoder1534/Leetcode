package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2316;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2316Test {
    private _2316.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2316.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.countPairs(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
    }

    @Test
    public void test2() {
        assertEquals(14, solution1.countPairs(7, new int[][]{{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}}));
    }

}
