package com.fishercoder;

import com.fishercoder.solutions._456;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _456Test {
    private static _456.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _456.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.find132pattern(new int[]{-1, 3, 2, 0}));

    }

}
