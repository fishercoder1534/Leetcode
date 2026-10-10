package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2333;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2333Test {
    private _2333.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2333.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(579, solution1.minSumSquareDiff(new int[]{1, 2, 3, 4}, new int[]{2, 10, 20, 19}, 0, 0));
    }
}
