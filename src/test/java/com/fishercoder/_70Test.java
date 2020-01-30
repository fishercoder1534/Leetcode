package com.fishercoder;

import com.fishercoder.solutions._70;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _70Test {
    private static _70.Solution1 solution1;
    private static _70.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _70.Solution1();
        solution2 = new _70.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.climbStairs(3));
    }

    @Test
    public void test2() {
        assertEquals(3, solution2.climbStairs(3));
    }

    @Test
    public void test3() {
        assertEquals(13, solution1.climbStairs(6));
    }

    @Test
    public void test4() {
        assertEquals(13, solution2.climbStairs(6));
    }
}
