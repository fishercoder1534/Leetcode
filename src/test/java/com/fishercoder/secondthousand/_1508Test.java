package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1508;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1508Test {
    private _1508.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1508.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5));
    }

}