package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3498;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3498Test {
    private _3498.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3498.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(148, solution1.reverseDegree("abc"));
    }

    @Test
    public void test2() {
        assertEquals(20, solution1.reverseDegree("g"));
    }
}
