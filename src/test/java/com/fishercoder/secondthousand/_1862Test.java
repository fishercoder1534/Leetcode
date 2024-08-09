package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1862;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1862Test {
    private _1862.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1862.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(49, solution1.sumOfFlooredPairs(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    public void test2() {
        assertEquals(10, solution1.sumOfFlooredPairs(new int[]{2, 5, 9}));
    }

    @Test
    public void test3() {
        assertEquals(17, solution1.sumOfFlooredPairs(new int[]{4, 3, 4, 3, 5}));
    }

}