package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1175;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class _1175Test {
    private _1175.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1175.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.numPrimeArrangements(5));
    }
}
