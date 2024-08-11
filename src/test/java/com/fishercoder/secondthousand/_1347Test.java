package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1347;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1347Test {
    private _1347.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1347.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minSteps("bab", "aba"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.minSteps("leetcode", "practice"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.minSteps("anagram", "mangaar"));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.minSteps("xxyyzz", "xxyyzz"));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.minSteps("friend", "family"));
    }

}