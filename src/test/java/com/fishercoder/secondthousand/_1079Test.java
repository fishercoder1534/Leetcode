package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1079;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1079Test {
    private static _1079.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1079.Solution1();
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