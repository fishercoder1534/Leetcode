package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._727;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _727Test {
    private _727.Solution1 solution1;
    private _727.Solution2 solution2;
    private static String S;
    private static String T;

    @BeforeEach
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
