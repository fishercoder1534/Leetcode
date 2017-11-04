package com.fishercoder;

import com.fishercoder.solutions._370;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _370Test {
    private static _370.Solution1 solution1;
    private static int[][] updates;
    private static int length;
    private static int[] expected;

    @BeforeClass
    public static void setup() {
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
