package com.fishercoder;

import com.fishercoder.solutions._1309;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _1309Test {
    private static _1309.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1309.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("jkab", solution1.freqAlphabets("10#11#12"));
    }

    @Test
    public void test2() {
        assertEquals("acz", solution1.freqAlphabets("1326#"));
    }

    @Test
    public void test3() {
        assertEquals("y", solution1.freqAlphabets("25#"));
    }

    @Test
    public void test4() {
        assertEquals("abcdefghijklmnopqrstuvwxyz", solution1.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
