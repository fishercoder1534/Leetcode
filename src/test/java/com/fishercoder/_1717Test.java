package com.fishercoder;

import com.fishercoder.solutions._1717;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1717Test {
    private static _1717.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1717.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(19, solution1.maximumGain("cdbcbbaaabab", 4, 5));
    }

    @Test
    public void test2() {
        assertEquals(20, solution1.maximumGain("aabbaaxybbaabb", 5, 4));
    }

}