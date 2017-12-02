package com.fishercoder;

import com.fishercoder.solutions._7;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _7Test {
    private static _7.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _7.Solution1();
    }

    @Test
    public void test1() {
//        its reversed number is greater than Integer.MAX_VALUE, thus return 0
        assertEquals(0, solution1.reverse(1534236469));
    }

}