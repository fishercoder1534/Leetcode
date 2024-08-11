package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._961;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _961Test {
    private _961.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _961.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{1, 2, 3, 3};
        assertEquals(3, solution1.repeatedNTimes(A));
    }

    @Test
    public void test2() {
        A = new int[]{2, 1, 2, 5, 3, 2};
        assertEquals(2, solution1.repeatedNTimes(A));
    }

    @Test
    public void test3() {
        A = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        assertEquals(5, solution1.repeatedNTimes(A));
    }

}