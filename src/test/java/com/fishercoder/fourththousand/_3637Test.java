package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3637;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _3637Test {
    private _3637.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3637.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isTrionic(new int[]{1, 3, 5, 4, 2, 6}));
    }

}
