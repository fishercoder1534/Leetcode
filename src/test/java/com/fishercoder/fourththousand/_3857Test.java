package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3857;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3857Test {
    private _3857.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3857.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minCost(3));
    }


    @Test
    public void test2() {
        assertEquals(28, solution1.minCost(8));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.minCost(1));
    }

}
