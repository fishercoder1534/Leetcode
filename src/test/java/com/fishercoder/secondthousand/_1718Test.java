package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1718;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1718Test {
    private _1718.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1718.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[] {3, 1, 2, 3, 2}, solution1.constructDistancedSequence(3));
    }
}
