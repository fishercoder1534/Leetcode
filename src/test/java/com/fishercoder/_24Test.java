package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._24;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _24Test {
    private static _24.Solution1 solution1;
    private static _24.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _24.Solution1();
        solution2 = new _24.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 1, 4, 3));
        assertEquals(expected, solution1.swapPairs(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 1, 4, 3));
        assertEquals(expected, solution2.swapPairs(head));
    }

}