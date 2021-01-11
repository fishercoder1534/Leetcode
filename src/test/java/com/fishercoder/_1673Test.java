package com.fishercoder;

import com.fishercoder.solutions._1673;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1673Test {
    private static _1673.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1673.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 6}, solution1.mostCompetitive(new int[]{3, 5, 2, 6}, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{2, 3, 3, 4}, solution1.mostCompetitive(new int[]{2, 4, 3, 3, 5, 4, 9, 6}, 4));
    }

}