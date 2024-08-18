package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2126;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2126Test {
    private _2126.Solution1 solution1;
    private static int[] asteroids;
    private static int mass;
    private boolean expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2126.Solution1();
    }

    @Test
    public void test1() {
        asteroids = new int[] {3, 9, 19, 5, 21};
        mass = 10;
        expected = true;
        assertEquals(expected, solution1.asteroidsDestroyed(mass, asteroids));
    }

    @Test
    public void test2() {
        asteroids = new int[] {4, 9, 23, 4};
        mass = 5;
        expected = false;
        assertEquals(expected, solution1.asteroidsDestroyed(mass, asteroids));
    }

    @Test
    public void test3() {
        asteroids = new int[] {156, 197, 192, 14, 97, 160, 14, 5};
        mass = 86;
        expected = true;
        assertEquals(expected, solution1.asteroidsDestroyed(mass, asteroids));
    }
}
