package com.fishercoder;

import com.fishercoder.solutions._150;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _150Test {
    private static _150.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _150.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

}
