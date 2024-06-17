package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2566;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2566Test {
    private static _2566.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2566.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(99009, solution1.minMaxDifference(11891));
    }

    @Test
    public void test2() {
        assertEquals(900, solution1.minMaxDifference(456));
    }

    @Test
    public void test3() {
        assertEquals(99, solution1.minMaxDifference(90));
    }

}