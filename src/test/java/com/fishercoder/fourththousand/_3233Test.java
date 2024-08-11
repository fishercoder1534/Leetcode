package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3233;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3233Test {
    private _3233.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3233.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.nonSpecialCount(5, 7));
    }

    @Test
    public void test2() {
        assertEquals(11, solution1.nonSpecialCount(4, 16));
    }

    @Test
    public void test3() {
        assertEquals(14, solution1.nonSpecialCount(1, 16));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.nonSpecialCount(1, 2));
    }

    @Test
    public void test5() {
        assertEquals(3, solution1.nonSpecialCount(1, 3));
    }

    @Test
    public void test6() {
        assertEquals(3, solution1.nonSpecialCount(1, 4));
    }

    @Test
    public void test7() {
        assertEquals(77, solution1.nonSpecialCount(1, 81));
    }

    @Test
    public void test8() {
        assertEquals(433, solution1.nonSpecialCount(1, 441));
    }

}