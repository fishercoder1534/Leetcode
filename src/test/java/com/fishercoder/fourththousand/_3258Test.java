package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3258;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3258Test {
    private _3258.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3258.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.countKConstraintSubstrings("10101", 1));
    }

    @Test
    public void test2() {
        assertEquals(25, solution1.countKConstraintSubstrings("1010101", 2));
    }
}
