package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._504;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 1/15/17.
 */
public class _504Test {
    private _504.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static int num;

    @BeforeEach
    public void setup() {
        solution1 = new _504.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = "";
        actual = "";
        num = 0;
    }

    @Test
    public void test1() {
        num = 100;
        expected = "202";
        actual = solution1.convertToBase7(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        num = -7;
        expected = "-10";
        actual = solution1.convertToBase7(num);
        assertEquals(expected, actual);
    }
}
