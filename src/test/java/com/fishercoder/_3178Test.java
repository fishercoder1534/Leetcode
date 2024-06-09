package com.fishercoder;

import com.fishercoder.solutions._3178;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3178Test {
    private static _3178.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3178.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.numberOfChild(3, 5));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.numberOfChild(5, 6));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.numberOfChild(4, 2));
    }

}