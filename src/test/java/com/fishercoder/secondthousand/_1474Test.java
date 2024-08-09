package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.secondthousand._1474;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1474Test {
    private _1474.Solution1 solution1;
    private static ListNode head;

    @BeforeEach
    public void setup() {
        solution1 = new _1474.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 2, 6, 7, 11, 12}), solution1.deleteNodes(head, 2, 3));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 5, 9}), solution1.deleteNodes(head, 1, 3));
    }

}
