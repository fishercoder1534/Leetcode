package com.fishercoder;

import com.fishercoder.solutions._1688;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1688Test {
    private static _1688.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1688.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.numberOfMatches(7));
    }

}