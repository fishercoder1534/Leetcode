package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._306;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _306Test {
    private _306.Solution1 solution1;
    private static String num;

    @BeforeEach
    public void setUp() {
        solution1 = new _306.Solution1();
    }

    @Test
    public void test1() {
        num = "0235813";
        assertEquals(false, solution1.isAdditiveNumber(num));
    }

    @Test
    public void test2() {
        num = "000";
        assertEquals(true, solution1.isAdditiveNumber(num));
    }

    @Test
    public void test3() {
        num = "011235";
        assertEquals(true, solution1.isAdditiveNumber(num));
    }
}
