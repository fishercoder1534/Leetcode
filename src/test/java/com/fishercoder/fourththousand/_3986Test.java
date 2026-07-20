package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3986;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3986Test {
    private _3986.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3986.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(25, solution1.secondsBetweenTimes("01:00:00", "01:00:25"));
    }

    @Test
    public void test2() {
        assertEquals(1504, solution1.secondsBetweenTimes("12:34:56", "13:00:00"));
    }
}
