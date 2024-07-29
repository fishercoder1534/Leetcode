package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._777;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _777Test {

    private static _777.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _777.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.canTransform("RXXLRXRXL", "XRLXXRRLX"));
    }

    @Test
    public void test2() {
        assertFalse(solution1.canTransform("X", "L"));
    }

    @Test
    public void test3() {
        assertTrue(solution1.canTransform("XXXXXLXXXX", "LXXXXXXXXX"));
    }

    @Test
    public void test4() {
        assertFalse(solution1.canTransform("LLR", "RRL"));
    }

    @Test
    public void test5() {
        assertFalse(solution1.canTransform("XXXL", "LXXR"));
    }

    @Test
    public void test6() {
        assertTrue(solution1.canTransform("RXXX", "XXXR"));
    }

    @Test
    public void test7() {
        assertTrue(solution1.canTransform("XXRXLXRXXX", "XXRLXXXXXR"));
    }

    @Test
    public void test8() {
        assertFalse(solution1.canTransform("XLLR", "LXLX"));
    }

    @Test
    public void test9() {
        assertFalse(solution1.canTransform("RXR", "XXR"));
    }

    @Test
    public void test10() {
        assertTrue(solution1.canTransform("XLXRRXXRXX", "LXXXXXXRRR"));
    }

    @Test
    public void test11() {
        assertFalse(solution1.canTransform("LXXLXRLXXL", "XLLXRXLXLX"));
    }

    @Test
    public void test12() {
        assertFalse(solution1.canTransform("XXXXXLXXXLXXXX", "XXLXXXXXXXXLXX"));
    }

}