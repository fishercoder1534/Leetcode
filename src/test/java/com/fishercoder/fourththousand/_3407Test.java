package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3407;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3407Test {
    private _3407.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3407.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.hasMatch("nrnrs", "*nn"));
    }
}
