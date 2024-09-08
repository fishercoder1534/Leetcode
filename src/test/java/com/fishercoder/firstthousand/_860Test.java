package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._860;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _860Test {

    private _860.Solution1 test;
    private static int[] bills;

    @BeforeEach
    public void setUp() {
        test = new _860.Solution1();
    }

    @Test
    public void test1() {
        bills = new int[] {5, 5, 5, 10, 20};
        assertEquals(true, test.lemonadeChange(bills));
    }

    @Test
    public void test2() {
        bills = new int[] {5, 5, 10};
        assertEquals(true, test.lemonadeChange(bills));
    }

    @Test
    public void test3() {
        bills = new int[] {10, 10};
        assertEquals(false, test.lemonadeChange(bills));
    }

    @Test
    public void test4() {
        bills = new int[] {5, 5, 10, 10, 20};
        assertEquals(false, test.lemonadeChange(bills));
    }

    @Test
    public void test5() {
        bills = new int[] {5, 5, 5, 20, 5, 5, 5, 10, 20, 5, 10, 20, 5, 20, 5, 10, 5, 5, 5, 5};
        assertEquals(false, test.lemonadeChange(bills));
    }
}
