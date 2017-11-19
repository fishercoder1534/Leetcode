package com.fishercoder;

import com.fishercoder.solutions._728;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _728Test {
    private static _728.Solution1 solution1;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _728.Solution1();
    }

    @Test
    public void test1() {
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertEquals(expected, solution1.selfDividingNumbers(1, 22));
    }

}