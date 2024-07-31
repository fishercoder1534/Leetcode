package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2928;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2928Test {
    private static _2928.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2928.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.distributeCandies(5, 2));
    }

    @Test
    public void test2() {
        assertEquals(10, solution1.distributeCandies(3, 3));
    }

}
