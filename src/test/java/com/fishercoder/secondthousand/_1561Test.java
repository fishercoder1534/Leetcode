package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1561;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1561Test {
    private _1561.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1561.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.maxCoins(new int[]{2, 4, 1, 2, 7, 8}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.maxCoins(new int[]{2, 4, 5}));
    }

    @Test
    public void test3() {
        assertEquals(18, solution1.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }

}
