package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2673;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2673Test {
    private static _2673.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2673.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.minIncrements(7, new int[]{1, 5, 2, 2, 3, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minIncrements(3, new int[]{5, 3, 3}));
    }

}
