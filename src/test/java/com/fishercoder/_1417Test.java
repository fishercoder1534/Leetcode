package com.fishercoder;

import com.fishercoder.solutions._1417;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1417Test {
    private static _1417.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1417.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("0a1b2c", solution1.reformat("a0b1c2"));
    }

    @Test
    public void test2() {
        assertEquals("c2o0v1i9d", solution1.reformat("covid2019"));
    }

}