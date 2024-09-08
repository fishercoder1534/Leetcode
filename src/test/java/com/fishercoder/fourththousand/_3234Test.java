package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3234;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3234Test {
    private _3234.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3234.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.numberOfSubstrings("00011"));
    }
}
