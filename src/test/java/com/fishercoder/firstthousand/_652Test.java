package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._652;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _652Test {
    private _652.Solution1 solution1;
    private static List<TreeNode> expected;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _652.Solution1();
    }

    @BeforeEach
    public void setUp() {
        root = null;
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(4);
        TreeNode tree2 = new TreeNode(4);
        expected = new ArrayList<>(Arrays.asList(tree2, tree1));
        assertEquals(expected, solution1.findDuplicateSubtrees(root));
    }

    @Test
    public void test2() {
        expected = new ArrayList<>();
        assertEquals(expected, solution1.findDuplicateSubtrees(root));
    }

    @Test
    public void test3() {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        TreeNode tree1 = new TreeNode(1);
        expected = new ArrayList<>(Arrays.asList(tree1));
        assertEquals(expected, solution1.findDuplicateSubtrees(root));
    }
}
