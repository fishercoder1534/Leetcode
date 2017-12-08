package com.fishercoder;

import com.fishercoder.solutions._13;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _13Test {
    private static _13.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _13.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.romanToInt("XII"));
    }

    @Test
    public void test2() {
        assertEquals(1000, solution1.romanToInt("M"));
    }

    @Test
    public void test3() {
        assertEquals(3999, solution1.romanToInt("MMMCMXCIX"));
    }
}
