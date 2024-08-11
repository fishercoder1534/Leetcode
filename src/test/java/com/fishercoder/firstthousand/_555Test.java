package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._555;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 4/29/17.
 */
public class _555Test {
    private _555.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String[] strs;

    @BeforeEach
    public void setup() {
        solution1 = new _555.Solution1();
    }

    @Test
    public void test1() {
        strs = new String[]{"abc", "xyz"};
        expected = "zyxcba";
        actual = solution1.splitLoopedString(strs);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        strs = new String[]{"lc", "evol", "cdy"};
        expected = "ylclovecd";
        actual = solution1.splitLoopedString(strs);
        assertEquals(expected, actual);
    }
}
