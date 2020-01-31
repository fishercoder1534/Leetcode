package com.fishercoder;

import com.fishercoder.solutions._1323;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1323Test {
    private static _1323.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1323.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9969, solution1.maximum69Number(9669));
    }

}