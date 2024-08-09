package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1390;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1390Test {
    private _1390.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1390.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(32, solution1.sumFourDivisors(new int[]{21, 4, 7}));
    }

}