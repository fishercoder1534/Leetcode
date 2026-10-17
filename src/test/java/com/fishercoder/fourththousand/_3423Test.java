package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3423;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3423Test {
    private _3423.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3423.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.maxAdjacentDistance(new int[]{3, 2, -5, -3}));
    }

}
