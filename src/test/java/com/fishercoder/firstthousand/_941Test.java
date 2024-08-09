package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._941;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _941Test {
    private _941.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _941.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{0, 3, 2, 1};
        assertEquals(true, solution1.validMountainArray(A));
    }

    @Test
    public void test2() {
        A = new int[]{2, 1};
        assertEquals(false, solution1.validMountainArray(A));
    }

    @Test
    public void test3() {
        A = new int[]{3, 5, 5};
        assertEquals(false, solution1.validMountainArray(A));
    }

    @Test
    public void test4() {
        A = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(false, solution1.validMountainArray(A));
    }

}