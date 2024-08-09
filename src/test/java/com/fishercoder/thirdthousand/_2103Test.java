package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2103;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2103Test {
    private _2103.Solution1 solution1;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2103.Solution1();
    }

    @Test
    public void test1() {
        expected = 1;
        assertEquals(expected, solution1.countPoints("B0B6G0R6R0R6G9"));
    }

}
