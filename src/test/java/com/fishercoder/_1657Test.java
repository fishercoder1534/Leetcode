package com.fishercoder;

import com.fishercoder.solutions._1657;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1657Test {
    private static _1657.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1657.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.closeStrings("abc", "bca"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.closeStrings("a", "aa"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.closeStrings("cabbba", "abbccc"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.closeStrings("cabbba", "aabbss"));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.closeStrings("abbbzcf", "babzzcz"));
    }
}