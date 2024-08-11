package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._681;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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