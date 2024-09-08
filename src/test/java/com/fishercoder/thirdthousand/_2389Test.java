package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.thirdthousand._2389;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2389Test {
    private _2389.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2389.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {2, 3, 4},
                solution1.answerQueries(new int[] {4, 5, 2, 1}, new int[] {3, 10, 21}));
    }
}
