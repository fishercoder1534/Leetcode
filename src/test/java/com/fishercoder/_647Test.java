package com.fishercoder;

import com.fishercoder.solutions._647;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _647Test {
    private static _647.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _647.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countSubstrings("abc"));
    }

}
