package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._441;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _441Test {
    private _441.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _441.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.arrangeCoins(3));
    }
}
