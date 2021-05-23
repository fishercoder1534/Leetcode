package com.fishercoder;

import com.fishercoder.solutions._1869;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1869Test {
    private static _1869.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1869.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkZeroOnes("1101"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.checkZeroOnes("111000"));
    }

}