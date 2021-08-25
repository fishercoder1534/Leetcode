package com.fishercoder;

import com.fishercoder.solutions._823;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _823Test {
    private static _823.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _823.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numFactoredBinaryTrees(new int[]{2, 4}));
    }

    @Test
    public void test2() {
        assertEquals(9, solution1.numFactoredBinaryTrees(new int[]{2, 3, 4, 6, 9}));
    }

    @Test
    public void test3() {
        assertEquals(25, solution1.numFactoredBinaryTrees(new int[]{2, 3, 4, 8, 16, 18}));
    }

}