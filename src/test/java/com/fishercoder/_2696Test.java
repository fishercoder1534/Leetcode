package com.fishercoder;

import com.fishercoder.solutions.thirdthousand._2696;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2696Test {
    private static _2696.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2696.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minLength("ABFCACDB"));
    }

}