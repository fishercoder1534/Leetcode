package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1758;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1758Test {
    private _1758.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1758.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minOperations("0100"));
    }
}
