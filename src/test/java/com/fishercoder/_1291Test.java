package com.fishercoder;

import com.fishercoder.solutions._1291;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@Ignore
public class _1291Test {
    private static _1291.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1291.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(), solution1.sequentialDigits(100, 300));
    }
}
