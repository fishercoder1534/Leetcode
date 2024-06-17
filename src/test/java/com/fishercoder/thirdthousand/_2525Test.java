package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2525;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2525Test {
    private static _2525.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2525.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("Both", solution1.categorizeBox(2909, 3968, 3272, 727));
    }

}