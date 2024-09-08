package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._600;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 5/28/17. */
public class _600Test {
    private _600.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _600.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.findIntegers(5));
        assertEquals(514229, solution1.findIntegers(100000000));
    }
}
