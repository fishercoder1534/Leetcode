package com.fishercoder;

import com.fishercoder.solutions._1390;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1390Test {
    private static _1390.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1390.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(32, solution1.sumFourDivisors(new int[]{21, 4, 7}));
    }

}