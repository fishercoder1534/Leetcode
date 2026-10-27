package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3551;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3551Test {
    private _3551.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3551.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minSwaps(new int[]{37, 100}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minSwaps(new int[]{18, 43, 34, 16}));
    }
}
