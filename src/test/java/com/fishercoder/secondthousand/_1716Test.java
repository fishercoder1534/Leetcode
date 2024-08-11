package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1716;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1716Test {
    private _1716.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1716.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.totalMoney(4));
    }

    @Test
    public void test2() {
        assertEquals(37, solution1.totalMoney(10));
    }

    @Test
    public void test3() {
        assertEquals(96, solution1.totalMoney(20));
    }

}