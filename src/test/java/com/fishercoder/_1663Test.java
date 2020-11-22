package com.fishercoder;

import com.fishercoder.solutions._1663;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1663Test {
    private static _1663.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1663.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("aay", solution1.getSmallestString(3, 27));
    }

    @Test
    public void test2() {
        assertEquals("aaszz", solution1.getSmallestString(5, 73));
    }

}