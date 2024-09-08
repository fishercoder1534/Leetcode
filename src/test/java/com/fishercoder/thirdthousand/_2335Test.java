package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2335;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2335Test {
    private _2335.Solution1 solution1;
    private static int[] amount;

    @BeforeEach
    public void setup() {
        solution1 = new _2335.Solution1();
    }

    @Test
    public void test1() {
        amount = new int[] {5, 4, 4};
        assertEquals(7, solution1.fillCups(amount));
    }

    @Test
    public void test2() {
        amount = new int[] {0, 0, 0};
        assertEquals(0, solution1.fillCups(amount));
    }
}
