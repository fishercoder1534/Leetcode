package com.fishercoder;

import com.fishercoder.solutions._1046;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _1046Test {
    private static _1046.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1046.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
