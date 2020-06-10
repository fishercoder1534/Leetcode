package com.fishercoder;

import com.fishercoder.solutions._1432;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1432Test {
    private static _1432.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1432.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(888, solution1.maxDiff(555));
    }

}