package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2224;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2224Test {
    private _2224.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2224.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.convertTime("02:30", "04:35"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.convertTime("11:00", "11:01"));
    }

}
