package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1110;
import com.fishercoder.solutions._206;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class _1110Test {
    private static _1110.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _1110.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        TreeUtils.printBinaryTree(root);
        List<TreeNode> actual = solution1.delNodes(root, new int[]{3, 5});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 4, 3));
        TreeUtils.printBinaryTree(root);
        List<TreeNode> actual = solution1.delNodes(root, new int[]{2, 3});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }
    }
}
