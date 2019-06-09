package com.fishercoder;

import com.fishercoder.solutions._5083;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _5083Test {
    private static _5083.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _5083.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"girl", "student"}, solution1.findOcurrences("alice is a good girl she is a good student", "a", "good"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"we", "rock"}, solution1.findOcurrences("we will we will rock you", "we", "will"));
    }

}