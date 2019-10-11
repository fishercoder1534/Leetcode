package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._23;
import org.junit.BeforeClass;
import org.junit.Test;

public class _23Test {
    private static _23.Solution1 solution1;
    private static ListNode[] lists;

    @BeforeClass
    public static void setup() {
        solution1 = new _23.Solution1();
    }

    @Test
    public void test1() {
        lists = new ListNode[]{new ListNode(1), new ListNode(7), new ListNode(5)};
        CommonUtils.printList(solution1.mergeKLists(lists));
    }

}