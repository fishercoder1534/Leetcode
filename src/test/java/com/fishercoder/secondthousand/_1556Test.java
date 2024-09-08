package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1556;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1556Test {
    private _1556.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1556.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("987", solution1.thousandSeparator(987));
    }

    @Test
    public void test2() {
        assertEquals("1.234", solution1.thousandSeparator(1234));
    }

    @Test
    public void test3() {
        assertEquals("0", solution1.thousandSeparator(0));
    }

    @Test
    public void test4() {
        assertEquals("123.456.789", solution1.thousandSeparator(123456789));
    }
}
