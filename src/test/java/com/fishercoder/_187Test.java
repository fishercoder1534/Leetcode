package com.fishercoder;

import com.fishercoder.solutions._187;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _187Test {
    private static _187.Solution1 solution1;
    private static _187.Solution2 solution2;
    private static String s;
    private static List<String> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _187.Solution1();
        solution2 = new _187.Solution2();
    }

    @Test
    public void test1() {
        s = "AAAAAAAAAAA";
        System.out.println(s.length());
        expected = new ArrayList<>(Arrays.asList("AAAAAAAAAA"));
        assertEquals(expected, solution1.findRepeatedDnaSequences(s));
        assertEquals(expected, solution2.findRepeatedDnaSequences(s));
    }

    @Test
    public void test2() {
        s = "AAAAAAAAAAAAA";
        System.out.println(s.length());
        expected = new ArrayList<>(Arrays.asList("AAAAAAAAAA"));
        assertEquals(expected, solution1.findRepeatedDnaSequences(s));
        assertEquals(expected, solution2.findRepeatedDnaSequences(s));
    }
}
