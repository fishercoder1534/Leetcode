package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1588;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1588Test {
    private _1588.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1588.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(58, solution1.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }

}