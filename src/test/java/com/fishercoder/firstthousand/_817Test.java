package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._817;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _817Test {
    private _817.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _817.Solution1();
    }

    @Test
    public void test1() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(0, 1, 2, 3));
        assertEquals(2, solution1.numComponents(head, new int[]{0, 1, 3}));
    }

    @Test
    public void test2() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(0, 1, 2, 3, 4));
        assertEquals(2, solution1.numComponents(head, new int[]{0, 3, 1, 4}));
    }

    @Test
    public void test3() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(0, 1, 2));
        assertEquals(1, solution1.numComponents(head, new int[]{1, 0}));
    }

}
