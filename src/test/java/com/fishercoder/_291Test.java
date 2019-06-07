package com.fishercoder;

import com.fishercoder.solutions._291;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _291Test {
    private static _291.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _291.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.wordPatternMatch("abab", "redblueredblue"));
    }
}
