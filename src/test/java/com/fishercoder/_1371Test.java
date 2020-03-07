package com.fishercoder;

import com.fishercoder.solutions._1371;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1371Test {
    private static _1371.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1371.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.findTheLongestSubstring("eleetminicoworoep"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.findTheLongestSubstring("leetcodeisgreat"));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.findTheLongestSubstring("bcbcbc"));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.findTheLongestSubstring("id"));
    }

}