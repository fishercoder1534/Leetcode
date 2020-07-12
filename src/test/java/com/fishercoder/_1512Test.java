package com.fishercoder;

import com.fishercoder.solutions._1512;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1512Test {
    private static _1512.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1512.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

}
