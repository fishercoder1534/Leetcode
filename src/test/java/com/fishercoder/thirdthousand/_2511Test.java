package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2511;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2511Test {
    private _2511.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2511.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.captureForts(new int[] {1, 0, 0, -1, 0, 0, 0, 0, 1}));
    }
}
