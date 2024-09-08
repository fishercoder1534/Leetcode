package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._273;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _273Test {
    private _273.Solution1 solution1;
    private static int num;

    @BeforeEach
    public void setup() {
        solution1 = new _273.Solution1();
    }

    @Test
    public void test1() {
        num = 123;
        assertEquals("One Hundred Twenty Three", solution1.numberToWords(num));
    }

    @Test
    public void test2() {
        num = 12345;
        assertEquals("Twelve Thousand Three Hundred Forty Five", solution1.numberToWords(num));
    }

    @Test
    public void test3() {
        num = 1234567;
        assertEquals(
                "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                solution1.numberToWords(num));
    }
}
