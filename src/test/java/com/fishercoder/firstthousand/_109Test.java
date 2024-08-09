package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._109;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _109Test {
    private _109.Solution1 solution1;
    private static ListNode head;
    private static TreeNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _109.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5});
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, 4, null, 2, null, 5));
        /**as long as it's a height-balanced tree, it's good for this problem requirement*/
        TreeUtils.printBinaryTree(solution1.sortedListToBST(head));
    }

}