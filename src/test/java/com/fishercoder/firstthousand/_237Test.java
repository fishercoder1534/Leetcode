package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._237;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _237Test {
    private _237.Solution1 solution1;
    private static ListNode head;

    @BeforeEach
    public void setup() {
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