package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1037;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1037Test {
    private _1037.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1037.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isBoomerang(new int[][]{new int[]{1, 1}, new int[]{2, 3}, new int[]{3, 2}}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isBoomerang(new int[][]{new int[]{1, 1}, new int[]{2, 2}, new int[]{3, 3}}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isBoomerang(new int[][]{new int[]{0, 0}, new int[]{0, 2}, new int[]{2, 1}}));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isBoomerang(new int[][]{new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 1}}));
    }

}