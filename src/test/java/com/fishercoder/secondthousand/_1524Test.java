package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1524;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1524Test {
    private _1524.Solution1 solution1;
    private _1524.Solution2 solution2;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1524.Solution1();
        solution2 = new _1524.Solution2();
    }

    @Test
    public void test1() {
        arr = new int[]{1, 3, 5};
        assertEquals(4, solution1.numOfSubarrays(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{2, 4, 6};
        assertEquals(0, solution1.numOfSubarrays(arr));
    }

    @Test
    public void test4() {
        arr = new int[]{1, 3, 5};
        assertEquals(4, solution2.numOfSubarrays(arr));
    }

    @Test
    public void test5() {
        arr = new int[]{2, 4, 6};
        assertEquals(0, solution2.numOfSubarrays(arr));
    }

    @Test
    public void test6() {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(16, solution2.numOfSubarrays(arr));
    }

    @Test
    public void test7() {
        arr = new int[]{1, 2, 3, 4, 5};
        assertEquals(9, solution2.numOfSubarrays(arr));
    }

    @Test
    public void test8() {
        arr = new int[]{1, 2, 3, 4};
        assertEquals(6, solution2.numOfSubarrays(arr));
    }

}