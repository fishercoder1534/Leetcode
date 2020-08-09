package com.fishercoder;

import com.fishercoder.solutions._1545;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1545Test {
    private static _1545.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1545.Solution1();
    }

    @Test
    public void test1() {
        assertEquals('0', solution1.findKthBit(3, 1));
    }

    @Test
    public void test2() {
        assertEquals('1', solution1.findKthBit(4, 11));
    }

    @Test
    public void test3() {
        assertEquals('0', solution1.findKthBit(1, 1));
    }

    @Test
    public void test4() {
        assertEquals('1', solution1.findKthBit(2, 3));
    }

}