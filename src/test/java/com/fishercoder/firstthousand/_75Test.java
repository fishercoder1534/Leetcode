package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._75;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _75Test {
    private _75.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _75.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 2, 1};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {1, 2, 2}, nums);
    }

    @Test
    public void test2() {
        nums = new int[] {0, 1, 2, 0, 2, 1};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void test3() {
        nums = new int[] {1, 0, 2};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0, 1, 2}, nums);
    }

    @Test
    public void test4() {
        nums = new int[] {1, 0};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0, 1}, nums);
    }

    @Test
    public void test5() {
        nums = new int[] {2};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {2}, nums);
    }

    @Test
    public void test6() {
        nums = new int[] {2, 0, 1};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0, 1, 2}, nums);
    }

    @Test
    public void test7() {
        nums = new int[] {0};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0}, nums);
    }

    @Test
    public void test8() {
        nums = new int[] {2, 2};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {2, 2}, nums);
    }

    @Test
    public void test9() {
        nums = new int[] {2};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {2}, nums);
    }

    @Test
    public void test10() {
        nums = new int[] {1};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {1}, nums);
    }

    @Test
    public void test11() {
        nums = new int[] {1, 2, 0};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0, 1, 2}, nums);
    }

    @Test
    public void test12() {
        nums = new int[] {1, 2, 1};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {1, 1, 2}, nums);
    }

    @Test
    public void test13() {
        nums = new int[] {2, 0, 2, 1, 1, 0};
        solution1.sortColors(nums);
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, nums);
    }
}
