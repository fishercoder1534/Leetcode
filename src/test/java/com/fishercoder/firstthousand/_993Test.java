package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._993;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _993Test {
    private _993.Solution1 solution1;
    private _993.Solution2 solution2;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _993.Solution1();
        solution2 = new _993.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isCousins(root, 4, 3));
        assertEquals(false, solution2.isCousins(root, 4, 3));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4, null, 5));
        TreeUtils.printBinaryTree(root);
        assertEquals(true, solution1.isCousins(root, 5, 4));
        assertEquals(true, solution2.isCousins(root, 5, 4));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isCousins(root, 2, 3));
        assertEquals(false, solution2.isCousins(root, 2, 3));
    }
}
