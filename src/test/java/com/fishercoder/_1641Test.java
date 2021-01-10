package com.fishercoder;

import com.fishercoder.solutions._1641;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1641Test {
    private static _1641.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1641.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.countVowelStrings(1));
    }

    @Test
    public void test2() {
        assertEquals(15, solution1.countVowelStrings(2));
    }

    @Test
    public void test3() {
        assertEquals(35, solution1.countVowelStrings(3));
    }

    @Test
    public void test4() {
        assertEquals(70, solution1.countVowelStrings(4));
    }

    @Test
    public void test5() {
        assertEquals(66045, solution1.countVowelStrings(33));
    }

}