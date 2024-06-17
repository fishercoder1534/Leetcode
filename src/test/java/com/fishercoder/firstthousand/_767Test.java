package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._767;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _767Test {
    private static _767.Solution1 solution1;
    private static _767.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _767.Solution1();
        solution2 = new _767.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("aba", solution1.reorganizeString("aab"));
        assertEquals("aba", solution2.reorganizeString("aab"));
    }

    @Test
    public void test2() {
        assertEquals("", solution1.reorganizeString("aaab"));
        assertEquals("", solution2.reorganizeString("aaab"));
    }

    @Test
    public void test3() {
        assertEquals("bababab", solution1.reorganizeString("aaabbbb"));
        assertEquals("bababab", solution2.reorganizeString("aaabbbb"));
    }

    @Test
    public void test4() {
        assertEquals("vovlv", solution1.reorganizeString("vvvlo"));
        assertEquals("vovlv", solution2.reorganizeString("vvvlo"));
    }
}
