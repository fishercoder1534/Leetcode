package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1675;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1675Test {
    private _1675.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1675.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minimumDeviation(new int[] {1, 2, 3, 4}));
    }
}
