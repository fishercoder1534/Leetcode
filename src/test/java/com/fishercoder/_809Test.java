package com.fishercoder;

import com.fishercoder.solutions._809;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _809Test {
    private static _809.Solution1 solution1;
    private String[] words;
    private String S;

    @BeforeClass
    public static void setup() {
        solution1 = new _809.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] {"hello", "hi", "helo"};
        S = "heeellooo";
        assertEquals(1, solution1.expressiveWords(S, words));
    }
}
