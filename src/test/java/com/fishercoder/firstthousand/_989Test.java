package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._989;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _989Test {
    private _989.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setUp() {
        solution1 = new _989.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] {1, 2, 0, 0};
        assertEquals(Arrays.asList(1, 2, 3, 4), solution1.addToArrayForm(A, 34));
    }

    @Test
    public void test2() {
        A = new int[] {2, 7, 4};
        assertEquals(Arrays.asList(4, 5, 5), solution1.addToArrayForm(A, 181));
    }

    @Test
    public void test3() {
        A = new int[] {2, 1, 5};
        assertEquals(Arrays.asList(1, 0, 2, 1), solution1.addToArrayForm(A, 806));
    }

    @Test
    public void test4() {
        A = new int[] {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        assertEquals(
                Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), solution1.addToArrayForm(A, 1));
    }
}
