package com.fishercoder;

import com.fishercoder.solutions._1528;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1528Test {
    private static _1528.Solution1 solution1;
    private static int[] indices;

    @BeforeClass
    public static void setup() {
        solution1 = new _1528.Solution1();
    }

    @Test
    public void test1() {
        indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        assertEquals("leetcode", solution1.restoreString("codeleet", indices));
    }

}