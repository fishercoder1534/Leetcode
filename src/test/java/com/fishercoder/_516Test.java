package com.fishercoder;

import com.fishercoder.solutions._516;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _516Test {
    private static _516 test;

    @BeforeClass
    public static void setup() {
        test = new _516();
    }

    @Test
    public void test1() {
        assertEquals(4, test.longestPalindromeSubseq("bbbab"));
    }

}
