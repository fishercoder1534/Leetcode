package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._476;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 1/14/17.
 */
public class _476Test {
    private _476.Solution1 solution1;
    private _476.Solution2 solution2;
    private static int expected;
    private static int actual;
    private static int input;

    @BeforeEach
    public void setup() {
        solution1 = new _476.Solution1();
        solution2 = new _476.Solution2();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
        input = 0;
    }

    @Test
    public void test1() {

        input = 5;
        expected = 2;
        actual = solution1.findComplement(input);
        actual = solution2.findComplement(input);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {

        input = 5;
        expected = 2;
        actual = solution1.findComplement(input);
        actual = solution2.findComplement(input);
        assertEquals(expected, actual);

    }
}
