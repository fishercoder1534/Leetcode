package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._219;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _219Test {
    private _219.Solution1 solution1;
    private _219.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _219.Solution1();
        solution2 = new _219.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 2, 3, 1};
        assertEquals(true, solution1.containsNearbyDuplicate(nums, 3));
    }

    @Test
    public void test2() {
        nums = new int[] {1, 2, 3, 1};
        assertEquals(true, solution2.containsNearbyDuplicate(nums, 3));
    }

    @Test
    public void test3() {
        nums = new int[] {1, 2, 3, 1, 2, 3};
        assertEquals(false, solution2.containsNearbyDuplicate(nums, 2));
    }
}
