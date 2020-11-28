package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._237;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _237Test {
    private static _237.Solution1 solution1;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        solution1 = new _237.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(4, 5, 1, 9));
        CommonUtils.printList(head);
        solution1.deleteNode(head.next);
        CommonUtils.printList(head);
    }

}