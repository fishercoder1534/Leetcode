package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3208;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3208Test {
    private _3208.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3208.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numberOfAlternatingGroups(new int[] {0, 1, 0, 1, 0}, 3));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.numberOfAlternatingGroups(new int[] {0, 1, 0, 0, 1, 0, 1}, 6));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.numberOfAlternatingGroups(new int[] {1, 1, 0, 1}, 4));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.numberOfAlternatingGroups(new int[] {0, 1, 0, 1}, 3));
    }
}
