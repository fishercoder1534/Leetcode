package com.fishercoder;

import com.fishercoder.solutions.first_thousand._12;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _12Test {
    private static _12.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _12.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("XII", solution1.intToRoman(12));
    }

    @Test
    public void test2() {
        assertEquals("M", solution1.intToRoman(1000));
    }

    @Test
    public void test3() {
        assertEquals("MMMCMXCIX", solution1.intToRoman(3999));
    }
}
