package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1295;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1295Test {
    private _1295.Solution1 solution1;
    private _1295.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1295.Solution1();
        solution2 = new _1295.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findNumbers(new int[] {12, 345, 2, 6, 7896}));
        assertEquals(2, solution2.findNumbers(new int[] {12, 345, 2, 6, 7896}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.findNumbers(new int[] {555, 901, 482, 1771}));
        assertEquals(1, solution2.findNumbers(new int[] {555, 901, 482, 1771}));
    }
}
