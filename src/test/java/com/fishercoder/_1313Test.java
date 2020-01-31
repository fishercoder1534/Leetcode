package com.fishercoder;

import com.fishercoder.solutions._1313;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1313Test {
    private static _1313.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1313.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 4, 4, 4}, solution1.decompressRLElist(new int[]{1, 2, 3, 4}));
    }

}