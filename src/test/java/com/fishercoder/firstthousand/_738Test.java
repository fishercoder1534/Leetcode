package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._738;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _738Test {
    private _738.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _738.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.monotoneIncreasingDigits(10));
    }
}
