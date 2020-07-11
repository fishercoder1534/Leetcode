package com.fishercoder;

import com.fishercoder.solutions._886;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _886Test {
    private static _886.Solution1 solution1;
    private static int[][] dislikes;

    @BeforeClass
    public static void setup() {
        solution1 = new _886.Solution1();
    }

    @Test
    public void test1() {
        dislikes = new int[][]{
                {1, 2},
                {1, 3},
                {2, 4}
        };
        assertEquals(true, solution1.possibleBipartition(4, dislikes));
    }

}
