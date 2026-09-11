package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fifththousand._4043;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4043Test {
    private _4043.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4043.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countRotations("aab", 1));
    }
}
