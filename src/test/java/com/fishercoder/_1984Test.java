package com.fishercoder;

import com.fishercoder.solutions._1984;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1984Test {
    private static _1984.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1984.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.minimumDifference(new int[]{90}, 1));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minimumDifference(new int[]{9,4,1,7}, 2));
    }

}
