package com.fishercoder;

import com.fishercoder.solutions._699;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _699Test {
    private static _699.Solution1 solution1;
    private static int[][] positions;

    @BeforeClass
    public static void setup() {
        solution1 = new _699.Solution1();
    }

    @Test
    public void test1() {
        positions = new int[][]{
                {1, 2},
                {2, 3},
                {6, 1}
        };
        assertEquals(Arrays.asList(2, 5, 5), solution1.fallingSquares(positions));
    }
}