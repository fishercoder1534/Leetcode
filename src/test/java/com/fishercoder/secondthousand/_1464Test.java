package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1464;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1464Test {
    private _1464.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1464.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 4, 5, 2};
        assertEquals(12, solution1.maxProduct(nums));
    }

}