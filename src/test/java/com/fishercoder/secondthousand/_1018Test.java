package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1018;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1018Test {
    private _1018.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _1018.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] {0, 1, 1};
        assertEquals(Arrays.asList(true, false, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test2() {
        A = new int[] {1, 1, 1};
        assertEquals(Arrays.asList(false, false, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test3() {
        A = new int[] {0, 1, 1, 1, 1, 1};
        assertEquals(
                Arrays.asList(true, false, false, false, true, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test4() {
        A = new int[] {1, 1, 1, 0, 1};
        assertEquals(Arrays.asList(false, false, false, false, false), solution1.prefixesDivBy5(A));
    }

    @Test
    public void test5() {
        A =
                new int[] {
                    1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1,
                    0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1
                };
        assertEquals(
                Arrays.asList(
                        false, false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, true, false,
                        false, true, true, true, true, false),
                solution1.prefixesDivBy5(A));
    }
}
