package com.fishercoder;

import com.fishercoder.solutions._516;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _516Test {
    private static _516.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _516.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.longestPalindromeSubseq("bbbab"));
    }

}
