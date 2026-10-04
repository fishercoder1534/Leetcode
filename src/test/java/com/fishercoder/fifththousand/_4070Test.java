package com.fishercoder.fifththousand;

import com.fishercoder.solutions.fifththousand._4070;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4070Test {
    private _4070.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4070.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.minRotations("1200210200"));
    }
}
