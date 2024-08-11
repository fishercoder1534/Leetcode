package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1010;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1010Test {
    private _1010.Solution1 solution1;
    private _1010.Solution2 solution2;
    private static int[] time;

    @BeforeEach
    public void setup() {
        solution1 = new _1010.Solution1();
        solution2 = new _1010.Solution2();
    }

    @Test
    public void test1() {
        time = new int[]{30, 20, 150, 100, 40};
        assertEquals(3, solution1.numPairsDivisibleBy60(time));
        assertEquals(3, solution2.numPairsDivisibleBy60(time));
    }

    @Test
    public void test2() {
        time = new int[]{60, 60, 60};
        assertEquals(3, solution1.numPairsDivisibleBy60(time));
        assertEquals(3, solution2.numPairsDivisibleBy60(time));
    }

}
