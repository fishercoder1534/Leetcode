package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._457;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _457Test {
    private _457.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _457.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, -1, 1, 2, 2};
        assertEquals(true, solution1.circularArrayLoop(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{-1, 2};
        assertEquals(false, solution1.circularArrayLoop(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{-1, 2, 3};
        assertEquals(false, solution1.circularArrayLoop(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{2, 1, 9};
        assertEquals(false, solution1.circularArrayLoop(nums));
    }

}