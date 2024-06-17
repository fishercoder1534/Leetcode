package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1461;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1461Test {
    private static _1461.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1461.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.hasAllCodes("00110110", 2));
    }

}