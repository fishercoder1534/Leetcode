package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3633;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3633Test {
    private _3633.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3633.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.earliestFinishTime(new int[]{2, 8}, new int[]{4, 1}, new int[]{6}, new int[]{3}));
    }

    @Test
    public void test2() {
        assertEquals(14, solution1.earliestFinishTime(new int[]{5}, new int[]{3}, new int[]{1}, new int[]{10}));
    }

    @Test
    public void test3() {
        assertEquals(158, solution1.earliestFinishTime(new int[]{99}, new int[]{59}, new int[]{99, 54}, new int[]{85, 20}));
    }

    @Test
    public void test4() {
        assertEquals(114, solution1.earliestFinishTime(new int[]{94, 85}, new int[]{20, 54}, new int[]{20, 4}, new int[]{2, 35}));
    }

    @Test
    public void test5() {
        assertEquals(143, solution1.earliestFinishTime(new int[]{94, 46}, new int[]{59, 97}, new int[]{7}, new int[]{13}));
    }

}
