package com.fishercoder;

import com.fishercoder.solutions._838;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _838Test {
    private static _838.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _838.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("LL.RR.LLRRLL..", solution1.pushDominoes(".L.R...LR..L.."));
    }

    @Test
    public void test2() {
        assertEquals("RR.L", solution1.pushDominoes("RR.L"));
    }

    @Test
    public void test3() {
        assertEquals(".", solution1.pushDominoes("."));
    }

    @Test
    public void test4() {
        assertEquals("..RRR", solution1.pushDominoes("..R.."));
    }

    @Test
    public void test5() {
        assertEquals("RRR.L", solution1.pushDominoes("R.R.L"));
    }

}