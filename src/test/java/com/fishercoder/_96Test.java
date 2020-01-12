package com.fishercoder;

import com.fishercoder.solutions._96;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _96Test {
    private static _96.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _96.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.numTrees(3));
    }

}
