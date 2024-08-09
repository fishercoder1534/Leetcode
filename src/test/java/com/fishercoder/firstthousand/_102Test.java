package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._102;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _102Test {
    private _102.Solution1 solution1;
    private static TreeNode treeRoot;

    @BeforeEach
    public void setup() {
        solution1 = new _102.Solution1();
    }

    @Test
    public void test1() {
        treeRoot = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(treeRoot);
        CommonUtils.printListList(solution1.levelOrder(treeRoot));
    }

    @Test
    public void test2() {
        treeRoot = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        TreeUtils.printBinaryTree(treeRoot);
        CommonUtils.printListList(solution1.levelOrder(treeRoot));
    }

}