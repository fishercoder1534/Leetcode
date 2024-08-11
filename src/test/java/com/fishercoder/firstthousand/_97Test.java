package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._97;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _97Test {
    private _97.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _97.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

}
