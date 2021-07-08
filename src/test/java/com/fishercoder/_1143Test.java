package com.fishercoder;

import com.fishercoder.solutions._1143;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1143Test {
    private static _1143.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1143.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.longestCommonSubsequence("ezupkr", "ubmrapg"));
    }

}
