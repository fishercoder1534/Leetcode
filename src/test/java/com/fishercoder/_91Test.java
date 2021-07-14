package com.fishercoder;

import com.fishercoder.solutions._91;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _91Test {
    private static _91.Solution1 solution1;
    private static _91.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _91.Solution1();
        solution2 = new _91.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.numDecodings("12"));
        assertEquals(2, solution2.numDecodings("12"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.numDecodings("10"));
        assertEquals(1, solution2.numDecodings("10"));
    }

}
