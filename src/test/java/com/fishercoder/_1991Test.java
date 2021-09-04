package com.fishercoder;

import com.fishercoder.solutions._1991;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1991Test {
    private static _1991.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1991.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.findMiddleIndex(new int[]{2, 3, -1, 8, 4}));
    }

}