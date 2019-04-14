package com.fishercoder;

import com.fishercoder.solutions._1009;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1009Test {
    private static _1009.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1009.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.bitwiseComplement(5));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.bitwiseComplement(10));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.bitwiseComplement(7));
    }

    @Test
    public void test4() {
        assertEquals(3, solution1.bitwiseComplement(12));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.bitwiseComplement(0));
    }

}