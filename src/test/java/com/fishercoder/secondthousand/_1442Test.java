package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1442;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1442Test {
    private _1442.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1442.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.countTriplets(new int[]{2, 3, 1, 6, 7}));
    }

    @Test
    public void test2() {
        assertEquals(10, solution1.countTriplets(new int[]{1, 1, 1, 1, 1}));
    }
}