package com.fishercoder;

import com.fishercoder.solutions._672;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _672Test {
    private static _672.Solution1 solution1;
    private static _672.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _672.Solution1();
        solution2 = new _672.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.flipLights(1, 1));
        assertEquals(2, solution2.flipLights(1, 1));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.flipLights(2, 1));
        assertEquals(3, solution2.flipLights(2, 1));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.flipLights(3, 1));
        assertEquals(4, solution2.flipLights(3, 1));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.flipLights(4, 1));
        assertEquals(4, solution2.flipLights(4, 1));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.flipLights(10, 1));
        assertEquals(4, solution2.flipLights(10, 1));
    }

    @Test
    public void test6() {
        assertEquals(4, solution1.flipLights(2, 2));
        assertEquals(4, solution2.flipLights(2, 2));
    }

    @Test
    public void test7() {
        assertEquals(2, solution1.flipLights(1, 2));
        assertEquals(2, solution2.flipLights(1, 2));
    }

    @Test
    public void test8() {
        assertEquals(2, solution1.flipLights(1, 3));
        assertEquals(2, solution2.flipLights(1, 3));
    }

    @Test
    public void test9() {
        assertEquals(2, solution1.flipLights(1, 4));
        assertEquals(2, solution2.flipLights(1, 4));
    }

    @Test
    public void test10() {
        assertEquals(2, solution1.flipLights(1, 5));
        assertEquals(2, solution2.flipLights(1, 5));
    }

    @Test
    public void test11() {
        assertEquals(2, solution1.flipLights(1, 10));
        assertEquals(2, solution2.flipLights(1, 10));
    }

    @Test
    public void test12() {
        assertEquals(7, solution1.flipLights(3, 2));
        assertEquals(7, solution2.flipLights(3, 2));
    }

    @Test
    public void test13() {
        assertEquals(8, solution1.flipLights(7, 5));
        assertEquals(8, solution2.flipLights(7, 5));
    }

    @Test
    public void test14() {
        assertEquals(1, solution1.flipLights(1, 0));
        assertEquals(1, solution2.flipLights(1, 0));
    }

    @Test
    public void test15() {
        assertEquals(8, solution1.flipLights(7, 5));
        assertEquals(8, solution2.flipLights(7, 5));
    }

}