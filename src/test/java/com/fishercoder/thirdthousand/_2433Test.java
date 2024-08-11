package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2433;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2433Test {
    private _2433.Solution1 solution1;
    private static int[] pref;

    @BeforeEach
    public void setup() {
        solution1 = new _2433.Solution1();
    }

    @Test
    public void test1() {
        pref = new int[]{5, 2, 0, 3, 1};
        assertArrayEquals(new int[]{5, 7, 2, 3, 2}, solution1.findArray(pref));
    }

}