package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2760;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class _2760Test {
    private _2760.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2760.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.longestAlternatingSubarray(new int[]{4}, 1));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.longestAlternatingSubarray(new int[]{1, 2}, 2));
    }

}