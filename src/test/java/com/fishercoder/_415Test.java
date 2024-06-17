package com.fishercoder;

import com.fishercoder.solutions.first_thousand._415;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _415Test {
    private static _415.Solution1 solution1;
    private static _415.Solution2 solution2;
    private static String expected;
    private static String actual;
    private static String num1;
    private static String num2;

    @BeforeEach
    public void setup() {
        solution1 = new _415.Solution1();
        solution2 = new _415.Solution2();
    }

    @Test
    public void test1() {
        num1 = "123";
        num2 = "34567";
        expected = "34690";
        actual = solution1.addStrings(num1, num2);
        assertEquals(expected, actual);
        actual = solution2.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        num1 = "1";
        num2 = "9";
        expected = "10";
        actual = solution1.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        num1 = "9";
        num2 = "99";
        expected = "108";
        actual = solution1.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

}
