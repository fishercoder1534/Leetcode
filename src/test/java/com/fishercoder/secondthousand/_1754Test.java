package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1754;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1754Test {
    private static _1754.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1754.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("cbcabaaaaa", solution1.largestMerge("cabaa", "bcaaa"));
    }

}