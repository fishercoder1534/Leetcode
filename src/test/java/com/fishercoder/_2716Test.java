package com.fishercoder;

import com.fishercoder.solutions._2716;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2716Test {
    private static _2716.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2716.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minimizedStringLength("ipi"));
    }

}