package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._370;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _370Test {
    private _370.Solution1 solution1;
    private static int[][] updates;
    private static int length;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _370.Solution1();
    }

    @Test
    public void test1() {
        updates = new int[][]{
                {1, 3, 2},
                {2, 4, 3},
                {0, 2, -2},
        };
        length = 5;
        expected = new int[]{-2, 0, 3, 5, 3};
        assertArrayEquals(expected, solution1.getModifiedArray(length, updates));
    }

}
