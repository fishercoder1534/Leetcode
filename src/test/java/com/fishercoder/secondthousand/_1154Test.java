package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1154;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1154Test {
    private _1154.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1154.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.dayOfYear("2019-01-09"));
    }

    @Test
    public void test2() {
        assertEquals(271, solution1.dayOfYear("1969-09-28"));
    }

}