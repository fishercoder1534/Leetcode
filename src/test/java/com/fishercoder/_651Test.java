package com.fishercoder;

import com.fishercoder.solutions._651;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _651Test {
    private static _651 test;

    @BeforeClass
    public static void setup() {
        test = new _651();
    }

    @Test
    public void test1() {
        assertEquals(3, test.maxA(3));
    }

    @Test
    public void test2() {
        assertEquals(324, test.maxA(20));
    }

    @Test
    public void test3() {
        assertEquals(256, test.maxA(19));
    }

    @Test
    public void test4() {
        assertEquals(1, test.maxA(1));
    }

    @Test
    public void test5() {
        assertEquals(1327104, test.maxA(50));
    }

    @Test
    public void test6() {
        assertEquals(9, test.maxA(7));
    }
}
