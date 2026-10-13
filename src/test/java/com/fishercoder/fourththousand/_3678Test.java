package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3678;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3678Test {
    private _3678.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3678.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.smallestAbsent(new int[]{3, 5}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.smallestAbsent(new int[]{-1, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.smallestAbsent(new int[]{4, -1}));
    }
}
