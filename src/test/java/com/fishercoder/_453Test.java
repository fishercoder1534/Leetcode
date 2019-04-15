package com.fishercoder;

import com.fishercoder.solutions._453;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class _453Test {
    private static _453.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _453.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minMoves(new int[]{1, 2, 3}));
    }

}