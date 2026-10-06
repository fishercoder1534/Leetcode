package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3870;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3870Test {
    private _3870.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3870.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countCommas(1002));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.countCommas(998));
    }

    @Test
    public void test3() {
        assertEquals(1020, solution1.countCommas(2019));
    }
}
