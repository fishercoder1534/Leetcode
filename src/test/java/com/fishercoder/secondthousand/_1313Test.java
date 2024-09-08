package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1313;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1313Test {
    private _1313.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1313.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {2, 4, 4, 4}, solution1.decompressRLElist(new int[] {1, 2, 3, 4}));
    }
}
