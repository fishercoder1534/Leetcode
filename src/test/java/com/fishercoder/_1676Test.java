package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1676;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1676Test {
    private static _1676.Solution1 solution1;

    @Test
    public void test1() {
        solution1 = new _1676.Solution1();
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeNode node1 = TreeUtils.constructBinaryTree(Arrays.asList(4));
        TreeNode node2 = TreeUtils.constructBinaryTree(Arrays.asList(7));
        TreeNode[] nodes = new TreeNode[]{node1, node2};
        TreeNode lca = TreeUtils.constructBinaryTree(Arrays.asList(2, 7, 4));
        assertEquals(lca, solution1.lowestCommonAncestor(root, nodes));
    }

}
