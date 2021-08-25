package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._23;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _23Test {
    private static _23.Solution1 solution1;
    private static ListNode[] lists;

    @BeforeClass
    public static void setup() {
        solution1 = new _23.Solution1();
    }

    @Test
    public void test1() {
        ListNode head1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 3, 5, 7, 11));
        ListNode head2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 8, 12));
        ListNode head3 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(4, 6, 9, 10));
        lists = new ListNode[]{head1, head2, head3};
        CommonUtils.printList(solution1.mergeKLists(lists));
    }

}