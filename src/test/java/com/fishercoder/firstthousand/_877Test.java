package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._877;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _877Test {
    private static _877.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _877.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.stoneGame(new int[]{5, 3, 4, 5}));
    }

}