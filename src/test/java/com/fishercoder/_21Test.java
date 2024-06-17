package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.first_thousand._21;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _21Test {
    private static _21.Solution1 solution1;
    private static _21.Solution2 solution2;
    private static ListNode l1;
    private static ListNode l2;

    @BeforeEach
    public void setup() {
        solution1 = new _21.Solution1();
        solution2 = new _21.Solution2();
    }

    @Test
    public void test1() {
        l1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 5));
        l2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 4, 6));
        assertEquals(LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 2, 3, 4, 5, 6)), solution1.mergeTwoLists(l1, l2));
    }

    @Test
    public void test2() {
        l1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 5));
        l2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 4, 6));
        assertEquals(LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 2, 3, 4, 5, 6)), solution2.mergeTwoLists(l1, l2));
    }

}