package com.fishercoder;

import com.fishercoder.solutions._1337;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1337Test {
    private static _1337.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1337.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.removePalindromeSub("ababa"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.removePalindromeSub("abb"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.removePalindromeSub("baabb"));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.removePalindromeSub(""));
    }

}