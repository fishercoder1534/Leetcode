package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3364;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3364Test {
    private _3364.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3364.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minimumSumSubarray(Arrays.asList(3, -2, 1, 4), 2, 3));
    }

    @Test
    public void test2() {
        assertEquals(8, solution1.minimumSumSubarray(Arrays.asList(-12, 8), 1, 1));
    }
}
