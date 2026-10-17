package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3452;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3452Test {
    private _3452.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3452.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.sumOfGoodNumbers(new int[]{1, 3, 2, 1, 5, 4}, 2));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.sumOfGoodNumbers(new int[]{2, 1}, 1));
    }

    @Test
    public void test3() {
        assertEquals(45, solution1.sumOfGoodNumbers(new int[]{45, 38, 20}, 1));
    }
}
