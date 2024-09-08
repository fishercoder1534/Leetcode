package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1544;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1544Test {
    private _1544.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1544.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("leetcode", solution1.makeGood("leEeetcode"));
    }

    @Test
    public void test2() {
        assertEquals("", solution1.makeGood("abBAcC"));
    }

    @Test
    public void test3() {
        assertEquals("s", solution1.makeGood("s"));
    }
}
