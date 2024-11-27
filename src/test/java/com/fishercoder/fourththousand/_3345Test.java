package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3345;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3345Test {
    private _3345.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3345.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.smallestNumber(10, 2));
    }
}
