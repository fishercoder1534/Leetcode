package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1826;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1826Test {
    private _1826.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1826.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.badSensor(new int[] {2, 3, 4, 5}, new int[] {2, 1, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.badSensor(new int[] {2, 2, 2, 2, 2}, new int[] {2, 2, 2, 2, 5}));
    }

    @Test
    public void test3() {
        assertEquals(
                2, solution1.badSensor(new int[] {2, 3, 2, 2, 3, 2}, new int[] {2, 3, 2, 3, 2, 7}));
    }

    @Test
    public void test4() {
        assertEquals(
                -1,
                solution1.badSensor(new int[] {1, 2, 3, 2, 3, 2}, new int[] {1, 2, 3, 3, 2, 3}));
    }
}
