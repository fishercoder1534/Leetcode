package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1605;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1605Test {
    private _1605.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1605.Solution1();
    }

    @Test
    public void test1() {
        int[][] expected = new int[][]{
                {0, 5, 0}, {0, 1, 6}, {8, 0, 2}
        };
        assertArrayEquals(expected, solution1.restoreMatrix(new int[]{5, 7, 10}, new int[]{8, 6, 8}));
    }

}
