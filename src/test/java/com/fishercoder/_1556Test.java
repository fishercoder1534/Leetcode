package com.fishercoder;

import com.fishercoder.solutions._1556;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1556Test {
    private static _1556.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1556.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("987", solution1.thousandSeparator(987));
    }

    @Test
    public void test2() {
        assertEquals("1.234", solution1.thousandSeparator(1234));
    }

    @Test
    public void test3() {
        assertEquals("0", solution1.thousandSeparator(0));
    }

    @Test
    public void test4() {
        assertEquals("123.456.789", solution1.thousandSeparator(123456789));
    }

}