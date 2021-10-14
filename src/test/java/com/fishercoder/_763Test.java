package com.fishercoder;

import com.fishercoder.solutions._763;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _763Test {
    private static _763.Solution1 solution1;
    private static _763.Solution2 solution2;
    private static List<Integer> expected;
    private static String s;

    @BeforeClass
    public static void setup() {
        solution1 = new _763.Solution1();
        solution2 = new _763.Solution2();
    }

    @Test
    public void test1() {
        expected = Arrays.asList(9, 7, 8);
        s = "ababcbacadefegdehijhklij";
        assertEquals(expected, solution1.partitionLabels(s));
        assertEquals(expected, solution2.partitionLabels(s));
    }

    @Test
    public void test2() {
        expected = Arrays.asList(10);
        s = "eccbbbbdec";
        assertEquals(expected, solution1.partitionLabels(s));
        assertEquals(expected, solution2.partitionLabels(s));
    }

    @Test
    public void test3() {
        expected = Arrays.asList(1, 9);
        s = "caedbdedda";
        assertEquals(expected, solution1.partitionLabels(s));
        assertEquals(expected, solution2.partitionLabels(s));
    }


}
