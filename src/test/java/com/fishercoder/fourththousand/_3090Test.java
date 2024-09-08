package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3090;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3090Test {
    private _3090.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3090.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maximumLengthSubstring("bcbbbcba"));
    }
}
