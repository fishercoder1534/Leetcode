package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3783;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3783Test {
    private _3783.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3783.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(27, solution1.mirrorDistance(25));
    }
}
