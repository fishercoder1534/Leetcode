package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._679;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _679Test {
    private _679.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _679.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.judgePoint24(new int[] {4, 1, 8, 7}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.judgePoint24(new int[] {1, 2, 1, 2}));
    }

    @Test
    public void test3() {
        //        8 / (1 - 2/3) = 24
        assertEquals(true, solution1.judgePoint24(new int[] {1, 2, 3, 8}));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.judgePoint24(new int[] {1, 3, 4, 6}));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.judgePoint24(new int[] {1, 9, 1, 2}));
    }
}
