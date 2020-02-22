package com.fishercoder;

import com.fishercoder.solutions._1358;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore
public class _1358Test {
    private static _1358.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1358.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.numberOfSubstrings("abcabc"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.numberOfSubstrings("aaacb"));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.numberOfSubstrings("abc"));
    }

}