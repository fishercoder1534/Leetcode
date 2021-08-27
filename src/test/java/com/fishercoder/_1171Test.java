package com.fishercoder;

import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._1171;
import com.fishercoder.solutions._96;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1171Test {
    private static _1171.Solution1 solution1;
    private static _1171.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1171.Solution1();
        solution2 = new _1171.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{3, 1}), solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{1, 2, -3, 3, 1})));
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{3, 1}), solution2.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{1, 2, -3, 3, 1})));
    }

    @Test
    public void test2() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 2, 4}), solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, -3, 4})));
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 2, 4}), solution2.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, -3, 4})));
    }

    @Test
    public void test3() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1}), solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, -3, -2})));
    }

    @Test
    public void test4() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{5, -2, -5}),
                solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{5, -3, -4, 1, 6, -2, -5})));
    }

    @Test
    public void test5() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{}),
                solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{0})));
    }

    @Test
    public void test6() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{2}),
                solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{2, 0})));
    }

    @Test
    public void test7() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 5, 1}),
                solution1.removeZeroSumSublists(LinkedListUtils.contructLinkedList(new int[]{1, 3, 2, -3, -2, 5, 100, -100, 1})));
    }

}
