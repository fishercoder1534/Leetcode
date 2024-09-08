package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1451;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1451Test {
    private _1451.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1451.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("Is cool leetcode", solution1.arrangeWords("Leetcode is cool"));
    }
}
