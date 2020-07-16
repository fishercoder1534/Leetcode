package com.fishercoder;

import com.fishercoder.solutions._1508;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1508Test {
    private static _1508.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1508.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5));
    }

}