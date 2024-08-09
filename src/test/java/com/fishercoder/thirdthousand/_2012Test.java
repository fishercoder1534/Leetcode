package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2012;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2012Test {
    private _2012.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2012.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.sumOfBeauties(new int[]{2, 4, 6, 4}));
    }

    @Test
    public void test2() {
        assertEquals(14, solution1.sumOfBeauties(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.sumOfBeauties(new int[]{9, 9, 3, 8, 7, 9, 6, 10}));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.sumOfBeauties(new int[]{8, 4, 6, 3, 10, 5, 8, 5, 5, 9}));
    }

}