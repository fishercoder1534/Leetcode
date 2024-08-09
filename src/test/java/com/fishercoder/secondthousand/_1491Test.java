package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1491;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1491Test {
    private _1491.Solution1 solution1;
    private static int[] salary;

    @BeforeEach
    public void setup() {
        solution1 = new _1491.Solution1();
    }

    @Test
    public void test1() {
        salary = new int[]{4000, 3000, 1000, 2000};
        assertEquals(2500.0000, solution1.average(salary));
    }

}