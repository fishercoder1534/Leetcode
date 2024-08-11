package com.fishercoder.thirdthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.thirdthousand._2096;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2096Test {
    private _2096.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2096.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(5, 1, 2, 3, null, 6, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals("UURL", solution1.getDirections(root, 3, 6));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals("L", solution1.getDirections(root, 2, 1));
    }

    @Test
    public void test3() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        TreeUtils.printBinaryTree(root);
        assertEquals("U", solution1.getDirections(root, 2, 1));
    }

    @Test
    public void test4() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(5, 8, 3, 1, null, 4, 7, 6, null, null, null, null, null, null, 2));
        TreeUtils.printBinaryTree(root);
        assertEquals("U", solution1.getDirections(root, 4, 3));
    }

}