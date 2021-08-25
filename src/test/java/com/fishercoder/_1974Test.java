package com.fishercoder;

import com.fishercoder.solutions._1974;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1974Test {
    private static _1974.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1974.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.minTimeToType("abc"));
    }

    @Test
    public void test2() {
        assertEquals(7, solution1.minTimeToType("bza"));
    }

    @Test
    public void test3() {
        assertEquals(34, solution1.minTimeToType("zjpc"));
    }
}
