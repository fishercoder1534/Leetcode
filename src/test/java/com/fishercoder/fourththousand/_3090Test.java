package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3090;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3090Test {
    private static _3090.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3090.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maximumLengthSubstring("bcbbbcba"));
    }

}