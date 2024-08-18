package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1165;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1165Test {
    private _1165.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1165.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }

    @Test
    public void test2() {
        assertEquals(73, solution1.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }
}
