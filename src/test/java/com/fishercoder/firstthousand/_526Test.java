package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._526;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _526Test {
    private _526.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _526.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countArrangement(2));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.countArrangement(3));
    }

}