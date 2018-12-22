package com.fishercoder;

import com.fishercoder.solutions._925;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _925Test {
    private static _925.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _925.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isLongPressedName("leelee", "lleeelee"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.isLongPressedName("laiden", "laiden"));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.isLongPressedName("pyplrz", "ppyypllr"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.isLongPressedName("leelee", "lleeelee"));
    }
}