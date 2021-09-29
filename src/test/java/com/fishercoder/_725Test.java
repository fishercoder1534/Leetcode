package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._725;
import org.junit.BeforeClass;
import org.junit.Test;

public class _725Test {
    private static _725.Solution1 solution1;
    private static _725.Solution2 solution2;
    private static _725.Solution3 solution3;
    private static ListNode root;
    private static int k;
    private static ListNode[] actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _725.Solution1();
        solution2 = new _725.Solution2();
        solution3 = new _725.Solution3();
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

    @Test
    public void test5() {
        root = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3});
        k = 5;
        actual = solution3.splitListToParts(root, k);
        for (ListNode head : actual) {
            LinkedListUtils.printList(head);
        }
    }

    @Test
    public void test6() {
        root = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        k = 3;
        actual = solution3.splitListToParts(root, k);
        for (ListNode head : actual) {
            LinkedListUtils.printList(head);
        }
    }

}