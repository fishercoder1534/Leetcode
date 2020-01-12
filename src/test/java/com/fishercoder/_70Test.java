package com.fishercoder;

import com.fishercoder.solutions._70;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _70Test {
    private static _70.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _70.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.climbStairs(3));
    }
}
