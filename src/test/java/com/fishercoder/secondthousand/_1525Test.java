package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1525;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1525Test {
    private _1525.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1525.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.numSplits("aacaba"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.numSplits("abcd"));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numSplits("aaaaa"));
    }

}