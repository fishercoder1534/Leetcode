package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._681;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _681Test {
    private _681.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _681.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("19:39", solution1.nextClosestTime("19:34"));
    }
}
