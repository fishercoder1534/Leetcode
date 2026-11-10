package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3693;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3693Test {
    private _3693.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3693.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.climbStairs(4, new int[]{1, 2, 3, 4}));
    }

}
