package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1461;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1461Test {
    private _1461.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1461.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.hasAllCodes("00110110", 2));
    }
}
