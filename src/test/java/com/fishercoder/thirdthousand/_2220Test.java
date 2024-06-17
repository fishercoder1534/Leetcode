package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2220;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2220Test {
    private static _2220.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2220.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minBitFlips(10, 7));
    }

}