package com.fishercoder;

import com.fishercoder.solutions._402;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/3/17.
 */
public class _402Test {
    private static _402 test;

    @BeforeClass
    public static void setup() {
        test = new _402();
    }

    @Test
    public void test1() {
        assertEquals("1219", test.removeKdigits("1432219", 3));
    }
}
