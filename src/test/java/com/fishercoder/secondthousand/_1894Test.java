package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1894;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1894Test {
    private _1894.Solution1 solution1;
    private static int[] chalk;

    @BeforeEach
    public void setup() {
        solution1 = new _1894.Solution1();
    }

    @Test
    public void test1() {
        chalk = new int[] {3, 4, 1, 2};
        assertEquals(1, solution1.chalkReplacer(chalk, 25));
    }
}
