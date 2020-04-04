package com.fishercoder;

import com.fishercoder.solutions._1401;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1401Test {
    private static _1401.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1401.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkOverlap(1, 0, 0, 1, -1, 3, 1));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.checkOverlap(1, 0, 0, -1, 0, 0, 1));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.checkOverlap(1, 1, 1, -3, -3, 3, 3));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.checkOverlap(1, 1, 1, 1, -3, 2, 1));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.checkOverlap(1, 1, 1, 1, -3, 2, -1));
    }

}