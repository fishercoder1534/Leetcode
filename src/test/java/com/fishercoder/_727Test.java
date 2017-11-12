package com.fishercoder;

import com.fishercoder.solutions._727;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _727Test {
    private static _727.Solution1 solution1;
    private static _727.Solution2 solution2;
    private static String S;
    private static String T;

    @Before
    public void setup() {
        solution1 = new _727.Solution1();
        solution2 = new _727.Solution2();
    }

    @Test
    public void test1() {
        S = "abcdebdde";
        T = "bde";
        assertEquals("bcde", solution1.minWindow(S, T));
        assertEquals("bcde", solution2.minWindow(S, T));
    }

    @Test
    public void test2() {
        String S = "jmeqksfrsdcmsiwvaovztaqenprpvnbstl";
        String T = "l";
        assertEquals("l", solution1.minWindow(S, T));
        assertEquals("l", solution2.minWindow(S, T));
    }

}