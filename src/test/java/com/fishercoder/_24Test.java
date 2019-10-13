package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._24;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _24Test {
    private static _24.Solution1 solution1;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        solution1 = new _24.Solution1();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        CommonUtils.printList(solution1.swapPairs(head));
    }

}