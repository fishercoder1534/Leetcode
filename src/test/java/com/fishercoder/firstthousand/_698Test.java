package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._698;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _698Test {
    private _698.Solution1 solution1;
    private _698.Solution2 solution2;
    private static int[] nums;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _698.Solution1();
        solution2 = new _698.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        k = 4;
        assertEquals(true, solution1.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test2() {
        nums = new int[]{-1, 1, 0, 0};
        k = 4;
        assertEquals(false, solution1.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test3() {
        nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        k = 4;
        assertEquals(true, solution2.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test4() {
        nums = new int[]{-1, 1, 0, 0};
        k = 4;
        assertEquals(false, solution2.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test5() {
        nums = new int[]{2, 2, 2, 2, 3, 4, 5};
        k = 4;
        assertEquals(false, solution2.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test6() {
        nums = new int[]{1, 2, 3, 4};
        k = 3;
        assertEquals(false, solution2.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test7() {
        nums = new int[]{1, 1, 1, 1, 2, 2, 2, 2};
        k = 3;
        assertEquals(true, solution2.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test8() {
        /**This test case clearly shows how backtracking plays out beautifully!*/
        nums = new int[]{3522, 181, 521, 515, 304, 123, 2512, 312, 922, 407, 146, 1932, 4037, 2646, 3871, 269};
        k = 5;
        assertEquals(true, solution2.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test9() {
        nums = new int[]{1, 2, 3, 5};
        k = 2;
        assertEquals(false, solution2.canPartitionKSubsets(nums, k));
    }

}
