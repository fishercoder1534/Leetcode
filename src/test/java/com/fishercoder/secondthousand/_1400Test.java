package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1400;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1400Test {
    private _1400.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1400.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.canConstruct("annabelle", 2));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.canConstruct("leetcode", 3));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.canConstruct("true", 4));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.canConstruct("yzyzyzyzyzyzyzy", 2));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.canConstruct("cr", 7));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.canConstruct("qlkzenwmmnpkopu", 15));
    }

    @Test
    public void test7() {
        assertEquals(true, solution1.canConstruct("jsautfnlcmwqpzycehdulmdencthhlzsnijd", 35));
    }

}