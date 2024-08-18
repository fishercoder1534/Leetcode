package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2220;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2220Test {
    private _2220.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2220.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minBitFlips(10, 7));
    }
}
