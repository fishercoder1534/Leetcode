package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._522;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 12/31/16.
 */
public class _522Test {

    private _522.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static String[] strs;

    @BeforeEach
    public void setup() {
        solution1 = new _522.Solution1();
    }

    @Test
    public void test1() {
        strs = new String[]{"aaa", "aaa", "aa"};
        expected = -1;
        actual = solution1.findLUSlength(strs);
        assertEquals(expected, actual);
    }

}
