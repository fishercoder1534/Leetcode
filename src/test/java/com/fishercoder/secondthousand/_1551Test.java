package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1551;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1551Test {
    private _1551.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1551.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minOperations(3));
    }

}