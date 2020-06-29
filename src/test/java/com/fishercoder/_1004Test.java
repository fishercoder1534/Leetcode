package com.fishercoder;

import com.fishercoder.solutions._1004;
import com.fishercoder.solutions._1128;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1004Test {
    private static _1004.Solution1 solution1;
    private static int[] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _1004.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, solution1.longestOnes(A, 2));
    }
}
