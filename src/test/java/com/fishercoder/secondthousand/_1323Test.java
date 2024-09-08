package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1323;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1323Test {
    private _1323.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1323.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9969, solution1.maximum69Number(9669));
    }
}
