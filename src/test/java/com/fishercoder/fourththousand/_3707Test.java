package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3707;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class _3707Test {
    private _3707.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3707.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.scoreBalance("ss"));
    }

    @Test
    public void test2() {
        assertFalse(solution1.scoreBalance("edb"));
    }

}
