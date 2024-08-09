package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1775;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1775Test {
    private _1775.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1775.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minOperations(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 1, 2, 2, 2, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minOperations(new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{6}));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.minOperations(new int[]{6, 6}, new int[]{1}));
    }

}
