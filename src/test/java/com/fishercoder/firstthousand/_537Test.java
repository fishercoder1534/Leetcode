package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._537;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 1/25/17.
 */
public class _537Test {
    private _537 .Solution1 solution1;
    private _537 .Solution2 solution2;
    private static String expected;
    private static String a;
    private static String b;

    @BeforeEach
    public void setup() {
        solution1 = new _537.Solution1();
        solution2 = new _537.Solution2();
    }

    @BeforeEach
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        expected = "0+2i";
        a = "1+1i";
        b = "1+1i";
        assertEquals(expected, solution1.complexNumberMultiply(a, b));
        assertEquals(expected, solution2.complexNumberMultiply(a, b));
    }

    @Test
    public void test2() {
        expected = "0+-2i";
        a = "1+-1i";
        b = "1+-1i";
        assertEquals(expected, solution2.complexNumberMultiply(a, b));
    }
}
