package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1317;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1317Test {
    private _1317.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1317.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{11, 999}, solution1.getNoZeroIntegers(1010));
    }

}