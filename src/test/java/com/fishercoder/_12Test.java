package com.fishercoder;

import com.fishercoder.solutions._12;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _12Test {
    private static _12.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _12.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("XII", solution1.intToRoman(12));
    }

    @Test
    public void test2() {
        assertEquals("M", solution1.intToRoman(1000));
    }

    @Test
    public void test3() {
        assertEquals("MMMCMXCIX", solution1.intToRoman(3999));
    }
}
