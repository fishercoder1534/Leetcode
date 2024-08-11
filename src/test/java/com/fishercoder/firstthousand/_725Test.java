package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._725;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _725Test {
    private _725.Solution1 solution1;
    private _725.Solution2 solution2;
    private static ListNode root;
    private static int k;
    private static ListNode[] actual;

    @BeforeEach
    public void setup() {
        solution1 = new _725.Solution1();
        solution2 = new _725.Solution2();
    }

    @Test
    public void test1() {
        root = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3});
        k = 5;
        actual = solution1.splitListToParts(root, k);
        for (ListNode head : actual) {
            LinkedListUtils.printList(head);
        }
    }

    @Test
    public void test2() {
        root = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        k = 3;
        actual = solution1.splitListToParts(root, k);
        for (ListNode head : actual) {
            LinkedListUtils.printList(head);
        }
    }

    @Test
    public void test3() {
        root = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3});
        k = 5;
        actual = solution2.splitListToParts(root, k);
        for (ListNode head : actual) {
            LinkedListUtils.printList(head);
        }
    }

    @Test
    public void test4() {
        root = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        k = 3;
        actual = solution2.splitListToParts(root, k);
        for (ListNode head : actual) {
            LinkedListUtils.printList(head);
        }
    }

}