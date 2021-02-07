package com.fishercoder;

import com.fishercoder.solutions._1752;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1752Test {
    private static _1752.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1752.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.check(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.check(new int[]{2, 1, 3, 4}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.check(new int[]{1, 2, 3}));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.check(new int[]{1, 1, 1}));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.check(new int[]{2, 1}));
    }

}
