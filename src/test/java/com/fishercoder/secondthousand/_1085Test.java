package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1085;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1085Test {
    private _1085.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1085.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.sumOfDigits(new int[]{34, 23, 1, 24, 75, 33, 54, 8}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.sumOfDigits(new int[]{99, 77, 33, 66, 55}));
    }
}
