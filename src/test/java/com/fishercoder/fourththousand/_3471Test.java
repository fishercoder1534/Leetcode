package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3471;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3471Test {
    private _3471.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3471.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.largestInteger(new int[] {3, 9, 2, 1, 7}, 3));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.largestInteger(new int[] {0, 0}, 2));
    }
}
