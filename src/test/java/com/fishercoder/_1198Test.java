package com.fishercoder;

import com.fishercoder.solutions._1198;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1198Test {
    private static _1198.Solution1 solution1;
    private static int[][] mat;

    @BeforeClass
    public static void setup() {
        solution1 = new _1198.Solution1();
    }

    @Test
    public void test1() {
        mat = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 4, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9}
        };
        assertEquals(5, solution1.smallestCommonElement(mat));
    }

}