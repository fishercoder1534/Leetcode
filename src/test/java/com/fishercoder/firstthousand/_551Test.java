package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._551;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _551Test {
    private _551.Solution1 test;
    private static boolean expected;
    private static boolean actual;
    private static String s;

    @BeforeEach
    public void setup() {
        test = new _551.Solution1();
    }

    @Test
    public void test1() {
        s = "ALLAPPL";
        expected = false;
        actual = test.checkRecord(s);
        assertEquals(expected, actual);
    }
}
