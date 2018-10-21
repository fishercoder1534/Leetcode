package com.fishercoder;

import com.fishercoder.solutions._709;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _709Test {
    private static _709.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _709.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("hello", solution1.toLowerCase("Hello"));
    }
}
