package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._507;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 1/25/17.
 */
public class _507Test {
    private _507.Solution1 solution1;
    private static boolean expected;
    private static boolean actual;
    private static int num;

    @BeforeEach
    public void setup() {
        solution1 = new _507.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        expected = true;
        num = 28;
        actual = solution1.checkPerfectNumber(num);
        assertEquals(expected, actual);
    }
}
