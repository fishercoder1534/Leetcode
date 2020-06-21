package com.fishercoder;

import com.fishercoder.solutions._1486;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1486Test {
    private static _1486.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1486.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.xorOperation(5, 0));
    }

}