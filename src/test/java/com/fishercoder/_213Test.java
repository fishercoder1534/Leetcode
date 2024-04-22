package com.fishercoder;

import com.fishercoder.solutions._213;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _213Test {
    private static _213.Solution1 solution1;
    private static _213.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _213.Solution1();
        solution2 = new _213.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.rob(new int[]{2, 3, 2}));
        assertEquals(3, solution2.rob(new int[]{2, 3, 2}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.rob(new int[]{1, 2, 3, 1}));
        assertEquals(4, solution2.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.rob(new int[]{0}));
        assertEquals(0, solution2.rob(new int[]{0}));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.rob(new int[]{0, 0}));
        assertEquals(0, solution2.rob(new int[]{0, 0}));
    }

    @Test
    public void test5() {
        assertEquals(340, solution1.rob(new int[]{200, 3, 140, 20, 10}));
        assertEquals(340, solution2.rob(new int[]{200, 3, 140, 20, 10}));
    }

}
