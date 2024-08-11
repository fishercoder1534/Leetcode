package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1512;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1512Test {
    private _1512.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1512.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

}
