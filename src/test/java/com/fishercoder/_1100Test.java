package com.fishercoder;

import com.fishercoder.solutions._1100;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1100Test {
    private static _1100.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1100.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.numKLenSubstrNoRepeats("havefunonleetcode", 5));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.numKLenSubstrNoRepeats("home", 5));
    }
}
