package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2309;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2309Test {
    private static _2309.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2309.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("E", solution1.greatestLetter("lEeTcOdE"));
    }

    @Test
    public void test2() {
        assertEquals("R", solution1.greatestLetter("arRAzFif"));
    }

}
