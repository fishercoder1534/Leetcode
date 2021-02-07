package com.fishercoder;

import com.fishercoder.solutions._1753;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1753Test {
    private static _1753.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1753.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.maximumScore(1, 2, 6));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.maximumScore(6, 2, 1));
    }

}