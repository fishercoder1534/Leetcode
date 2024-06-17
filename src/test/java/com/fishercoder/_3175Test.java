package com.fishercoder;

import com.fishercoder.solutions.fourththousand._3175;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3175Test {
    private static _3175.Solution1 solution1;
    private static int[] skills;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _3175.Solution1();
    }

    @Test
    public void test1() {
        skills = new int[]{16, 4, 7, 17};
        k = 562084119;
        assertEquals(3, solution1.findWinningPlayer(skills, k));
    }

}