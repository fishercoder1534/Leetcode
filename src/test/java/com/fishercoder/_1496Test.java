package com.fishercoder;

import com.fishercoder.solutions._1496;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1496Test {
    private static _1496.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1496.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isPathCrossing("NES"));
    }

}