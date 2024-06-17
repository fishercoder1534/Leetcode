package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2710;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2710Test {
    private static _2710.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2710.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("512301", solution1.removeTrailingZeros("51230100"));
    }

}