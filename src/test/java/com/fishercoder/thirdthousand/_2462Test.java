package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2462;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2462Test {
    private _2462.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2462.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.totalCost(new int[]{1, 2, 4, 1}, 3, 3));
    }

    @Test
    public void test2() {
        assertEquals(11, solution1.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4));
    }

    @Test
    public void test3() {
        assertEquals(423, solution1.totalCost(new int[]{31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58}, 11, 2));
    }

    @Test
    public void test4() {
        assertEquals(526, solution1.totalCost(new int[]{57, 33, 26, 76, 14, 67, 24, 90, 72, 37, 30}, 11, 2));
    }
}
