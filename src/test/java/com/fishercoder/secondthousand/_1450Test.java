package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1450;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1450Test {
    private _1450.Solution1 solution1;
    private static int[] startTime;
    private static int[] endTime;

    @BeforeEach
    public void setup() {
        solution1 = new _1450.Solution1();
    }

    @Test
    public void test1() {
        startTime = new int[] {1, 2, 3};
        endTime = new int[] {3, 2, 7};
        assertEquals(1, solution1.busyStudent(startTime, endTime, 4));
    }
}
