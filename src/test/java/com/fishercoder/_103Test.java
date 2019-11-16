package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._103;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _103Test {
    private static _103.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _103.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(solution1.zigzagLevelOrder(root));
    }

}