package com.fishercoder;

import com.fishercoder.solutions._1690;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1690Test {
    private static _1690.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1690.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.stoneGameVII(new int[]{5, 3, 1, 4, 2}));
    }

}