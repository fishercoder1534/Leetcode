package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._455;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _455Test {
    private _455.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _455.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.findContentChildren(new int[] {1, 2}, new int[] {1, 2, 3}));
    }
}
