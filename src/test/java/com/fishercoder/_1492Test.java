package com.fishercoder;

import com.fishercoder.solutions._1492;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1492Test {
    private static _1492.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1492.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.kthFactor(12, 3));
    }

}