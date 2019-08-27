package com.fishercoder;

import com.fishercoder.solutions._651;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _651Test {
    private static _651.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _651.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.maxA(3));
    }

    @Test
    public void test2() {
        assertEquals(324, solution1.maxA(20));
    }

    @Test
    public void test3() {
        assertEquals(256, solution1.maxA(19));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.maxA(1));
    }

    @Test
    public void test5() {
        assertEquals(1327104, solution1.maxA(50));
    }

    @Test
    public void test6() {
        assertEquals(9, solution1.maxA(7));
    }
}
