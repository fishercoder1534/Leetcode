package com.fishercoder;

import com.fishercoder.solutions._1451;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1451Test {
    private static _1451.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1451.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("Is cool leetcode", solution1.arrangeWords("Leetcode is cool"));
    }

}