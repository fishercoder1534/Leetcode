package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2765;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2765Test {
    private _2765.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2765.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.alternatingSubarray(new int[]{2, 3, 4, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.alternatingSubarray(new int[]{4, 5, 6}));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.alternatingSubarray(new int[]{31, 32, 31, 32, 33}));
    }

    @Test
    public void test4() {
        assertEquals(3, solution1.alternatingSubarray(new int[]{13, 14, 15, 14}));
    }
}
