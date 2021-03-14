package com.fishercoder;

import com.fishercoder.solutions._1790;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1790Test {
    private static _1790.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1790.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.areAlmostEqual("a", "z"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.areAlmostEqual("bank", "kanb"));
    }

}
