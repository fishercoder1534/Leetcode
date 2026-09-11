package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fifththousand._4038;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4038Test {
    private _4038.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4038.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.countSpecialIntegers(new int[] {1, 2, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.countSpecialIntegers(new int[] {22}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.countSpecialIntegers(new int[] {34, 34}));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.countSpecialIntegers(new int[] {3, 3, 1, 2, 2, 1}));
    }
}
