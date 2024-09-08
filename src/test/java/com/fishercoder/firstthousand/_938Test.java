package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._938;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _938Test {
    private _938.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setUp() {
        solution1 = new _938.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, 15, 3, 7, null, 18));
        TreeUtils.printBinaryTree(root);
        assertEquals(32, solution1.rangeSumBST(root, 7, 15));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, 15, 3, 7, 13, 18, 1, null, 6));
        TreeUtils.printBinaryTree(root);
        assertEquals(23, solution1.rangeSumBST(root, 6, 10));
    }
}
