package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._98;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/17/17.
 */
public class _98Test {
    private static _98.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _98.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertEquals(true, solution1.isValidBST(root));
    }

    @Test
    public void test2() {
        root = new TreeNode(0);
        assertEquals(true, solution1.isValidBST(root));
    }

    @Test
    public void test3() {
        root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertEquals(false, solution1.isValidBST(root));
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5, 1, 7, null, null, 3, 8));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isValidBST(root));
    }
}
