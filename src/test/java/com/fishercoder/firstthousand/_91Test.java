package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._91;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _91Test {
    private _91.Solution1 solution1;
    private _91.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _91.Solution1();
        solution2 = new _91.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.numDecodings("12"));
        assertEquals(2, solution2.numDecodings("12"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.numDecodings("10"));
        assertEquals(1, solution2.numDecodings("10"));
    }
}
