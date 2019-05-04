package com.fishercoder;

import com.fishercoder.solutions._476;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/14/17.
 */
public class _476Test {
    private static _476.Solution1 solution1;
    private static _476.Solution2 solution2;
    private static int expected;
    private static int actual;
    private static int input;

    @BeforeClass
    public static void setup() {
        solution1 = new _476.Solution1();
        solution2 = new _476.Solution2();
    }

    @Before
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
