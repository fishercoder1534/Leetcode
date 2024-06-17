package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2103;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2103Test {
    private static _2103.Solution1 solution1;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2103.Solution1();
    }

    @Test
    public void test1() {
        expected = 1;
        assertEquals(expected, solution1.countPoints("B0B6G0R6R0R6G9"));
    }

}
