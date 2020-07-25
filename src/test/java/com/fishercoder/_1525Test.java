package com.fishercoder;

import com.fishercoder.solutions._1525;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1525Test {
    private static _1525.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1525.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.numSplits("aacaba"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.numSplits("abcd"));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numSplits("aaaaa"));
    }

}