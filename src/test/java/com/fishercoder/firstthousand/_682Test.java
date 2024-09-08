package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._682;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _682Test {
    private _682.Solution1 solution1;
    private static String[] ops;

    @BeforeEach
    public void setup() {
        solution1 = new _682.Solution1();
    }

    @Test
    public void test1() {
        ops = new String[] {"5", "2", "C", "D", "+"};
        assertEquals(30, solution1.calPoints(ops));
    }

    @Test
    public void test2() {
        ops = new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"};
        assertEquals(27, solution1.calPoints(ops));
    }
}
