package com.fishercoder;

import com.fishercoder.solutions._681;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _681Test {
    private static _681.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _681.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("19:39", solution1.nextClosestTime("19:34"));
    }

}