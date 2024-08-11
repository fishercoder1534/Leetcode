package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1486;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1486Test {
    private _1486.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1486.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.xorOperation(5, 0));
    }

}