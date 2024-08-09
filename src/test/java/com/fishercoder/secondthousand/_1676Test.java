package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1676;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1676Test {
    private _1676.Solution1 solution1;
    private _1676.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1676.Solution1();
        solution2 = new _1676.Solution2();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeUtils.printBinaryTree(root);
        TreeNode node1 = TreeUtils.constructBinaryTree(Arrays.asList(4));
        TreeNode node2 = TreeUtils.constructBinaryTree(Arrays.asList(7));
        TreeNode[] nodes = new TreeNode[]{node1, node2};
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 7, 4));
        assertEquals(expected, solution1.lowestCommonAncestor(root, nodes));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeUtils.printBinaryTree(root);
        TreeNode node1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 8));
        TreeNode[] nodes = new TreeNode[]{node1};
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 8));
        //assertEquals(expected, solution1.lowestCommonAncestor(root, nodes));
        //assertEquals(expected, solution2.lowestCommonAncestor(root, nodes));
    }

}
