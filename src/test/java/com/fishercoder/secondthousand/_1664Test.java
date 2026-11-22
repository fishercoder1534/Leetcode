package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1664;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1664Test {
    private _1664.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1664.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.waysToMakeFair(new int[]{6, 1, 7, 4, 1}));
    }

}
