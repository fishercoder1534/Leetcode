package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1360;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1360Test {
    private _1360.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1360.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    public void test2() {
        assertEquals(15, solution1.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

}