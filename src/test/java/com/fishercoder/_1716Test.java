package com.fishercoder;

import com.fishercoder.solutions._1716;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1716Test {
    private static _1716.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1716.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.totalMoney(4));
    }

    @Test
    public void test2() {
        assertEquals(37, solution1.totalMoney(10));
    }

    @Test
    public void test3() {
        assertEquals(96, solution1.totalMoney(20));
    }

}