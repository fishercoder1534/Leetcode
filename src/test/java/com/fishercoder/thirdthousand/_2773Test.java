package com.fishercoder.thirdthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.thirdthousand._2773;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2773Test {
    private _2773.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2773.Solution1();
    }

    @Test
    public void test1() {
        //TODO: this is a special binary tree, so my regular way of building a binary tree won't build the tree per this definition
        //because a leaf node's left child's is pointing towards itself, i.e. the leaf, look at the leetcode example 1, node 5
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, null, 4, 5));
        TreeUtils.printBinaryTree(root);
//        assertEquals(2, solution1.heightOfTree(root));
    }
}
