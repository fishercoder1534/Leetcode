package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._29;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _29Test {
    private _29.Solution1 solution1;
    private _29.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _29.Solution1();
        solution2 = new _29.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.divide(4, 3));
    }

    @Test
    public void test2() {
        assertEquals(Integer.MAX_VALUE, solution1.divide(Integer.MIN_VALUE, -1));
    }

    @Test
    public void test3() {
        assertEquals(3, solution2.divide(10, 3));
    }
}
