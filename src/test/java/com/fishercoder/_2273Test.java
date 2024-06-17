package com.fishercoder;

import com.fishercoder.solutions.thirdthousand._2273;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _2273Test {
    private static _2273.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2273.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("abba", "cd"), solution1.removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"}));
    }

}