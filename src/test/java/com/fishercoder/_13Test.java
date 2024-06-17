package com.fishercoder;

import com.fishercoder.solutions.firstthousand._13;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _13Test {
    private static _13.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _13.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.romanToInt("XII"));
    }

    @Test
    public void test2() {
        assertEquals(1000, solution1.romanToInt("M"));
    }

    @Test
    public void test3() {
        assertEquals(3999, solution1.romanToInt("MMMCMXCIX"));
    }
}
