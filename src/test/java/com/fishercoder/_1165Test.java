package com.fishercoder;

import com.fishercoder.solutions._1165;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1165Test {
    private static _1165.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1165.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }

    @Test
    public void test2() {
        assertEquals(73, solution1.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }

}