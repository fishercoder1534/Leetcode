package com.fishercoder;

import com.fishercoder.solutions._467;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _467Test {
    private static _467.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _467.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.findSubstringInWraproundString("a"));

    }

}
