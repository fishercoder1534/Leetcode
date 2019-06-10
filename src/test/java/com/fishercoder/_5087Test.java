package com.fishercoder;

import com.fishercoder.solutions._5087;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _5087Test {
    private static _5087.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _5087.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.numTilePossibilities("AAB"));
    }

    @Test
    public void test2() {
        assertEquals(188, solution1.numTilePossibilities("AAABBC"));
    }

}