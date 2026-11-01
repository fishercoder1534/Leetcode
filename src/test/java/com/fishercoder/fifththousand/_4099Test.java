package com.fishercoder.fifththousand;

import com.fishercoder.solutions.fifththousand._4099;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4099Test {
    private _4099.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4099.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minOperations(new int[]{2, 1, 3, 4}, new int[]{0, 1, 0, 1}, 1));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.minOperations(new int[]{3, 1, 2}, new int[]{1, 0, 1}, 2));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.minOperations(new int[]{3, 2, 1}, new int[]{0, 1, 0}, 0));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.minOperations(new int[]{3, 2, 1}, new int[]{0, 1, 0}, 1));
    }

    @Test
    public void test5() {
        assertEquals(-1, solution1.minOperations(new int[]{4, 2, 3, 1}, new int[]{0, 1, 1, 0}, 1));
    }

    @Test
    public void test6() {
        assertEquals(-1, solution1.minOperations(new int[]{2, 3, 1}, new int[]{1, 0, 0}, 0));
    }

    @Test
    public void test7() {
        assertEquals(7, solution1.minOperations(new int[]{4, 2, 3, 1}, new int[]{0, 1, 1, 0}, 2));
    }

    @Test
    public void test8() {
        assertEquals(14, solution1.minOperations(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}, 0));
    }
}
