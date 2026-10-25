package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2762;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2762Test {
    private _2762.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2762.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.continuousSubarrays(new int[]{5, 4, 2, 4}));
    }
}
