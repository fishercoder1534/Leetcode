package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1385;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1385Test {
    private _1385.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1385.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
    }

}