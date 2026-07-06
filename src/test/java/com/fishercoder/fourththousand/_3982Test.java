package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3982;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3982Test {
    private _3982.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3982.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6074, solution1.maxDigitRange(new int[] {5724, 111, 350}));
    }
}
