package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1658;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1658Test {
    private _1658.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1658.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minOperations(new int[] {1, 1, 4, 2, 3}, 5));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minOperations(new int[] {5, 6, 7, 8, 9}, 4));
    }

    @Test
    public void test3() {
        assertEquals(5, solution1.minOperations(new int[] {3, 2, 20, 1, 1, 3}, 10));
    }

    @Test
    public void test4() {
        assertEquals(
                16,
                solution1.minOperations(
                        new int[] {
                            8828, 9581, 49, 9818, 9974, 9869, 9991, 10000, 10000, 10000, 9999, 9993,
                            9904, 8819, 1231, 6309
                        },
                        134365));
    }
}
