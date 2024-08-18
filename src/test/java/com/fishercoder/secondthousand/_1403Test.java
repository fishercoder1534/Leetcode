package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1403;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1403Test {
    private _1403.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1403.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(10, 9), solution1.minSubsequence(new int[] {4, 3, 10, 9, 8}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(7, 7, 6), solution1.minSubsequence(new int[] {4, 4, 7, 6, 7}));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(6), solution1.minSubsequence(new int[] {6}));
    }
}
