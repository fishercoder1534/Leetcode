package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._893;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _893Test {
    private _893.Solution1 solution1;
    private _893.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _893.Solution1();
        solution2 = new _893.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(
                3,
                solution1.numSpecialEquivGroups(
                        new String[] {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"}));
        assertEquals(
                3,
                solution2.numSpecialEquivGroups(
                        new String[] {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"}));
    }

    @Test
    public void test2() {
        assertEquals(
                3,
                solution1.numSpecialEquivGroups(
                        new String[] {"abc", "acb", "bac", "bca", "cab", "cba"}));
        assertEquals(
                3,
                solution2.numSpecialEquivGroups(
                        new String[] {"abc", "acb", "bac", "bca", "cab", "cba"}));
    }

    @Test
    public void test3() {
        assertEquals(
                1, solution1.numSpecialEquivGroups(new String[] {"abcd", "cdab", "adcb", "cbad"}));
        assertEquals(
                1, solution2.numSpecialEquivGroups(new String[] {"abcd", "cdab", "adcb", "cbad"}));
    }
}
