package com.fishercoder;

import com.fishercoder.solutions._1374;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1374Test {
    private static _1374.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1374.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.generateTheString(1).length());
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.generateTheString(4).length());
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.generateTheString(2).length());
    }

    @Test
    public void test4() {
        assertEquals(7, solution1.generateTheString(7).length());
    }

}