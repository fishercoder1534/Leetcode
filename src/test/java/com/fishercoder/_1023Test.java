package com.fishercoder;

import com.fishercoder.solutions._1023;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1023Test {
    private static _1023.Solution1 solution1;
    private String[] input = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};

    @BeforeClass
    public static void setup() {
        solution1 = new _1023.Solution1();
    }

    @Test
    public void test1() {
        String pattern = "FB";
        List<Boolean> expected = Arrays.asList(true, false, true, true, false);
        assertEquals(solution1.camelMatch(input, pattern), expected);
    }

    @Test
    public void test2() {
        String pattern = "FoBa";
        List<Boolean> expected = Arrays.asList(true, false, true, false, false);
        assertEquals(solution1.camelMatch(input, pattern), expected);
    }

    @Test
    public void test3() {
        String pattern = "FoBaT";
        List<Boolean> expected = Arrays.asList(false, true, false, false, false);
        assertEquals(solution1.camelMatch(input, pattern), expected);
    }
}
