package com.fishercoder;

import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._1836;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1836Test {
    private static _1836.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1836.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 3}), solution1.deleteDuplicatesUnsorted(LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 2})));
    }

    @Test
    public void test2() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{}), solution1.deleteDuplicatesUnsorted(LinkedListUtils.contructLinkedList(new int[]{2, 1, 1, 2})));
    }

    @Test
    public void test3() {
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 4}), solution1.deleteDuplicatesUnsorted(LinkedListUtils.contructLinkedList(new int[]{3, 2, 2, 1, 3, 2, 4})));
    }

}
