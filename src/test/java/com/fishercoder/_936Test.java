package com.fishercoder;

import com.fishercoder.solutions._936;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _936Test {
    private static _936.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _936.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 2}, solution1.movesToStamp("abc", "ababc"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{}, solution1.movesToStamp("aye", "eyeye"));
    }
}
