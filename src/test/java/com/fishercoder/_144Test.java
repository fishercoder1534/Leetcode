package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._144;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _144Test {
    private static _144.Solution1 solution1;
    private static _144.Solution2 solution2;
    private static _144.Solution3 solution3;
    private static TreeNode root;
    private static List<Integer> inorder;

    @BeforeClass
    public static void setup() {
        solution1 = new _144.Solution1();
        solution2 = new _144.Solution2();
        solution3 = new _144.Solution3();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, null, null, 5, 2, null, null, 4));
        inorder = solution1.preorderTraversal(root);
        assertEquals(Arrays.asList(3, 1, 5, 2, 4), inorder);
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));
        TreeUtils.printBinaryTree(root);
        inorder = solution1.preorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 4, 7, 8, 9, 3, 5, 6), inorder);
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, null, null, 5, 2, null, null, 4));
        inorder = solution2.preorderTraversal(root);
        assertEquals(Arrays.asList(3, 1, 5, 2, 4), inorder);
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));
        TreeUtils.printBinaryTree(root);
        inorder = solution2.preorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 4, 7, 8, 9, 3, 5, 6), inorder);
    }

    @Test
    public void test5() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, null, null, 6));
        TreeUtils.printBinaryTree(root);
        inorder = solution1.preorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 4, 6, 3, 5), inorder);
    }

    @Test
    public void test6() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, null, null, 6));
        TreeUtils.printBinaryTree(root);
        inorder = solution3.preorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 4, 6, 3, 5), inorder);
    }

}
