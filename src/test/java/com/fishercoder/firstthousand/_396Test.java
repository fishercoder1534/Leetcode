package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._396;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _396Test {
    private _396.Solution1 solution1;
    private _396.Solution2 solution2;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _396.Solution1();
        solution2 = new _396.Solution2();
    }

    @Test
    public void test1() {
        A = new int[]{4, 3, 2, 6};
        assertEquals(26, solution1.maxRotateFunction(A));
        assertEquals(26, solution2.maxRotateFunction(A));
    }

    @Test
    public void test2() {
        A = new int[]{1,2,3,4,5,6,7,8,9,10};
        assertEquals(330, solution1.maxRotateFunction(A));
        assertEquals(330, solution2.maxRotateFunction(A));
    }

}