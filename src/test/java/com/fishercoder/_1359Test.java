package com.fishercoder;

import com.fishercoder.solutions._1359;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1359Test {
    private static _1359.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1359.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.countOrders(1));
    }

    @Test
    public void test2() {
        assertEquals(6, solution1.countOrders(2));
    }

    @Test
    public void test3() {
        assertEquals(90, solution1.countOrders(3));
    }

}