package com.fishercoder;

import com.fishercoder.solutions._38;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _38Test {
    private static _38.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _38.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("21", solution1.countAndSay(3));
    }
}
