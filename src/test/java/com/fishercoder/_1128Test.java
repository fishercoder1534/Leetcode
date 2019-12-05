package com.fishercoder;

import com.fishercoder.solutions._1128;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1128Test {
    private static _1128.Solution1 solution1;
    private static int[][] dominoes;

    @BeforeClass
    public static void setup() {
        solution1 = new _1128.Solution1();
    }

    @Test
    public void test1() {
        dominoes = new int[][]{
                {1, 2},
                {2, 1},
                {3, 4},
                {5, 6}
        };
        assertEquals(1, solution1.numEquivDominoPairs(dominoes));
    }
}
