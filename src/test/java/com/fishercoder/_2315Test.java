package com.fishercoder;

import com.fishercoder.solutions.thirdthousand._2315;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2315Test {
    private static _2315.Solution1 solution1;
    private static String s;

    @BeforeClass
    public static void setup() {
        solution1 = new _2315.Solution1();
    }

    @Test
    public void test1() {
        s = "l|*e*et|c**o|*de|";
        assertEquals(2, solution1.countAsterisks(s));
    }

}