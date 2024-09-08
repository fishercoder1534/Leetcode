package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._781;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _781Test {
    private _781.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _781.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.numRabbits(new int[] {1, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(11, solution1.numRabbits(new int[] {10, 10, 10}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.numRabbits(new int[] {}));
    }

    @Test
    public void test4() {
        assertEquals(5, solution1.numRabbits(new int[] {1, 0, 1, 0, 0}));
    }

    @Test
    public void test5() {
        assertEquals(7, solution1.numRabbits(new int[] {1, 1, 1, 2, 2, 2}));
    }

    @Test
    public void test6() {
        assertEquals(13, solution1.numRabbits(new int[] {2, 1, 2, 2, 2, 2, 2, 2, 1, 1}));
    }
}
