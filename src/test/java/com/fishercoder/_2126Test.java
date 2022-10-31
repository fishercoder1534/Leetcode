package com.fishercoder;

import com.fishercoder.solutions._2126;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2126Test {
    private static _2126.Solution1 solution1;
    private static int[] asteroids;
    private static int mass;
    private boolean expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2126.Solution1();
    }

    @Test
    public void test1() {
        asteroids = new int[]{3, 9, 19, 5, 21};
        mass = 10;
        expected = true;
        assertEquals(expected, solution1.asteroidsDestroyed(mass, asteroids));
    }

    @Test
    public void test2() {
        asteroids = new int[]{4, 9, 23, 4};
        mass = 5;
        expected = false;
        assertEquals(expected, solution1.asteroidsDestroyed(mass, asteroids));
    }

    @Test
    public void test3() {
        asteroids = new int[]{156, 197, 192, 14, 97, 160, 14, 5};
        mass = 86;
        expected = true;
        assertEquals(expected, solution1.asteroidsDestroyed(mass, asteroids));
    }

}