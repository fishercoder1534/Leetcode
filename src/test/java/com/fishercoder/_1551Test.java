package com.fishercoder;

import com.fishercoder.solutions._1551;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1551Test {
    private static _1551.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1551.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minOperations(3));
    }

}