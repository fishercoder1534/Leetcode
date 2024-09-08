package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._319;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _319Test {
    private _319.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _319.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.bulbSwitch(2));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.bulbSwitch(3));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.bulbSwitch(4));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.bulbSwitch(5));
    }

    @Test
    public void test5() {
        assertEquals(2, solution1.bulbSwitch(6));
    }

    @Test
    public void test6() {
        assertEquals(2, solution1.bulbSwitch(7));
    }

    @Test
    public void test7() {
        assertEquals(2, solution1.bulbSwitch(8));
    }

    @Test
    public void test8() {
        assertEquals(3, solution1.bulbSwitch(9));
    }

    @Test
    public void test11() {
        assertEquals(3, solution1.bulbSwitch(15));
    }

    @Test
    public void test9() {
        assertEquals(4, solution1.bulbSwitch(17));
    }

    @Test
    public void test10() {
        assertEquals(4, solution1.bulbSwitch(16));
    }
}
