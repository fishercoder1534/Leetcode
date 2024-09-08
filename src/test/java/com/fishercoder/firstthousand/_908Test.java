package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._908;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _908Test {
    private _908.Solution1 solution1;
    private _908.Solution2 solution2;
    private static int[] A;

    @BeforeEach
    public void setUp() {
        solution1 = new _908.Solution1();
        solution2 = new _908.Solution2();
    }

    @Test
    public void test1() {
        A = new int[] {1};
        assertEquals(0, solution1.smallestRangeI(A, 0));
        assertEquals(0, solution2.smallestRangeI(A, 0));
    }

    @Test
    public void test2() {
        A = new int[] {0, 10};
        assertEquals(6, solution1.smallestRangeI(A, 2));
        assertEquals(6, solution2.smallestRangeI(A, 2));
    }

    @Test
    public void test3() {
        A = new int[] {1, 3, 6};
        assertEquals(0, solution1.smallestRangeI(A, 3));
        assertEquals(0, solution2.smallestRangeI(A, 3));
    }
}
