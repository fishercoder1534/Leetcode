package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3663;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3663Test {
    private _3663.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3663.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.getLeastFrequentDigit(723344511));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.getLeastFrequentDigit(1));
    }

}
