package com.fishercoder;

import com.fishercoder.solutions._1196;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1196Test {
    private static _1196.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1196.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxNumberOfApples(new int[]{100, 200, 150, 1000}));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.maxNumberOfApples(new int[]{900, 950, 800, 1000, 700, 800}));
    }

}