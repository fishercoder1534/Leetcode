package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1325;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1325Test {
    private _1325.Solution1 solution1;
    private _1325.Solution2 solution2;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1325.Solution1();
        solution2 = new _1325.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 2, null, 2, 4));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 3, null, 4));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.removeLeafNodes(root, 2));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 3, 3, 2));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, null, null, 2));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.removeLeafNodes(root, 3));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 2, null, 2));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.removeLeafNodes(root, 2));
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 1));
        TreeUtils.printBinaryTree(root);
        expected = null;
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.removeLeafNodes(root, 1));
    }

    @Test
    public void test5() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.removeLeafNodes(root, 1));
    }

    @Test
    public void test6() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 2, null, 2, 4));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 3, null, 4));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution2.removeLeafNodes(root, 2));
    }

    @Test
    public void test7() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 3, 3, 2));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, null, null, 2));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution2.removeLeafNodes(root, 3));
    }

    @Test
    public void test8() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 2, null, 2));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution2.removeLeafNodes(root, 2));
    }

    @Test
    public void test9() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 1));
        TreeUtils.printBinaryTree(root);
        expected = null;
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution2.removeLeafNodes(root, 1));
    }

    @Test
    public void test10() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution2.removeLeafNodes(root, 1));
    }
}
