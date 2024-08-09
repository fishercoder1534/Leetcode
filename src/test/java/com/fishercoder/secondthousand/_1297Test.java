package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1297;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1297Test {
    private _1297.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1297.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.maxFreq("aababcaab", 2, 3, 4));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.maxFreq("aaaa", 1, 3, 3));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.maxFreq("aabcabcab", 2, 2, 3));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.maxFreq("abcde", 2, 3, 3));
    }

}