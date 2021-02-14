package com.fishercoder;

import com.fishercoder.solutions._1758;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1758Test {
    private static _1758.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1758.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minOperations("0100"));
    }

}